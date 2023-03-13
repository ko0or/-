public class forEachEx {
enum Week { 월, 화, 수, 목, 금, 토, 일 };
/*
    열거형 이용 (+values() 메소드 이용)
    foreach 이용
*/
    public static void main(String[] args) {

        int sum = 0;
        int[] n = {1,2,3,4,5};
        String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };

        // int 타입 배열원소를 k로 하나씩 받는다.
        for (int k : n) {
            sum += k;
            System.out.print(k + " ");
        }
        System.out.println("합은: " + sum);

        // String 타입 배열원소를 k로 하나씩 받는다.
        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Week 타입 배열원소를 day로 하나씩 받는다.
        for (Week day : Week.values()) {
            System.out.print(day + " ");
        }
        System.out.println();


        // 테스트 ( 메소드이름옆에 대괄호를 넣으면 요소꺼내오기 가능 )
        System.out.println("인덱스번호로 요소 꺼내오기");
        
        System.out.println(Week.values()[0]);
        

    }
}