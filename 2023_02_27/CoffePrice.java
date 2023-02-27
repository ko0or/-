import java.util.Scanner;

public class CoffePrice {
    public static void main(String[] args) {
        
        // 커피주문을 받아서 커피명과 가격을 출력
        Scanner sc = new Scanner(System.in);
        int price = 0;

        // 입력받기
        System.out.print("무슨 커피 드릴까요?: ");
        String order = sc.next();


        // swtich 조건문 ( 한 변수에 대한 여러가지 조건들 )
        switch (order) {
            case "아메리카노":
                price = 1500;
                break;
            case "카라멜마끼야또":
                price = 3300;
                break;
            case "돌체라떼":
                price = 3800;
                break;
        
            default:
            System.out.println("메뉴에 없습니다! ");
                break;
        }
        
        // 가격이 있을때만 출력
        if (price > 0) System.out.println(order + "는 " + price + "원 입니다.");

        // 스캐너 종료
        sc.close();

    }
}
