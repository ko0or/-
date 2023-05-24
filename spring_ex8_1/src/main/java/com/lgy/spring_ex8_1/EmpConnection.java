package com.lgy.spring_ex8_1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EmpConnection implements EnvironmentAware, InitializingBean {

	@Override
	public void setEnvironment(Environment environment) {
		setEnv(environment);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		setEmpId( env.getProperty("emp.id") );
		setEmpPw(env.getProperty("emp.pw") );
	}
	
	private Environment env;
	private String empId;
	private String empPw;
	
	
	public Environment getEnv() { return env; }
	public String getEmpId() { return empId; }
 	public String getEmpPw() { return empPw; }

	public void setEnv(Environment env) { this.env = env; }
	public void setEmpId(String empId) { this.empId = empId; }
	public void setEmpPw(String empPw) { this.empPw = empPw; }
	
}
