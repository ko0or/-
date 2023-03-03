import java.util.Scanner;
public class ExStock {
/*
  [# if 와 if-else 를 사용하라]

  코스피 지수와 환율을 입력 받아 환율이 1150이상인 경우
  코스피가 2200 이상이면 상승장, 2199~2000이면 횡보장을 출력한다.
  
  환율이 1150미만인 경우는
  코스피가 2300 이상이면 상승장, 2299~2000이면 횡보장을 출력한다. 
  단 코스피 지수가 2000 미만이면 하락장을 출력한다.

*/
    public static void main(String[] args) {
        
        // 내가 작성한 코드
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("코스피 지수를 입력하세요(1800~2500): ");
        int kospi = scanner.nextInt();

        System.out.print("환율을 입력하세요(1100~1200): ");
        int rate = scanner.nextInt();

        if (rate >= 1150) {
            if (kospi >2200) { System.out.println("상승장"); }
            else if (kospi >= 2000 && kospi < 2200) { System.out.println("횡보장"); }
        
        } else if(rate < 1150) {
            if (kospi >= 2300) { System.out.println("상승장"); }
            else if (kospi >= 2000) { System.out.println("횡보장"); }
            else { System.out.println("하락장"); }
        }
        
        scanner.close();
        */
        
        
        
        
        // 강사님 ver
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("코스피 지수를 입력하세요(1800~2500): ");
        int kospi = scanner.nextInt();
        
        System.out.print("환율을 입력하세요(1100~1200): ");
        int rate = scanner.nextInt();

        if (rate < 1150) {
            if (kospi >= 2300) { 
                System.out.println("상승장"); 
            } else if (kospi >= 2000) {
                System.out.println("횡보장");   
            } else {
                System.out.println("하락장");
            }
            
        } else {
            if (kospi >= 2200) { 
                System.out.println("상승장"); 
            } else if (kospi >= 2000) {
                System.out.println("횡보장");   
            } else {
                System.out.println("하락장");
            }
            
        }
        
        scanner.close();




    }
}
