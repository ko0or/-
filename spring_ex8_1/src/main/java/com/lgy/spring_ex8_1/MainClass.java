package com.lgy.spring_ex8_1;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
    public static void main(String[] args) {
        
        // 스프링 애플리케이션 컨텍스트 생성
        ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
        
        // 환경 설정 가져오기
        ConfigurableEnvironment env = ctx.getEnvironment();
        
        // 속성 소스 가져오기
        MutablePropertySources propertySources  = env.getPropertySources();
        
        try {
            // oracle.account 파일을 속성 소스에 추가
            propertySources.addLast( new ResourcePropertySource("classpath:oracle.account") );
            System.out.println( "env.getProperty(\"emp.id\") => " + env.getProperty("emp.id") );
            System.out.println( "env.getProperty(\"emp.pw\") => " + env.getProperty("emp.pw") );
            
            // GenericXmlApplicationContext로 캐스팅하여 설정 파일 로드 및 리프레시
            GenericXmlApplicationContext gctx = (GenericXmlApplicationContext) ctx;
            gctx.load("classpath:applicationCTX.xml");
            gctx.refresh();
            
            // EmpConnection 빈 가져오기
            EmpConnection empConnection = gctx.getBean("empConnection", EmpConnection.class);
            
            // EmpConnection의 속성 출력
            System.out.println("empConnection.getEmpId() => " + empConnection.getEmpId() );
            System.out.println( "empConnection.getEmpPw() => " + empConnection.getEmpPw() );        
            
            
        } catch (Exception e) {
            // 예외가 발생한 경우 예외를 출력
            e.printStackTrace();
        }
    }
}
