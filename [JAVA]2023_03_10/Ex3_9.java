public class Ex3_9 {
    public static void main(String[] args) {
        
        /* 
        구구단을 배열로 생성
        값을 넣어본다 ex> 2*7=14, 9*4=36       
        1*1=1 ~ 9*9=81 까지
        */


        //  배열공간 생성: 높이9 X 너비9
        int[][] gugudan = new int[10][10];
        System.out.println("구구단 시작 !");
        
        for (int i = 1; i < gugudan.length; i++) {
        for (int j = 1; j < gugudan[i].length; j++) {
            gugudan[i][j] = i*j;
            // System.out.print(gugudan[i-1][j-1] + "\t");
        }
        // System.out.println();
        }

        System.out.println("2 X 7 = " + gugudan[2][7]);
        System.out.println("9 X 4 = " + gugudan[9][4]);
        

        
    }
}
