public class IrregularArray {
    public static void main(String[] args) {
        
        // 내가 작성한 코드
        /*
        // 높이 4칸, 너비는 미지정
        int intArray[][] = new int[4][];

        // 각 높이에 대한 너비는 여기에서 지정함 !
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];
        
        
        for (int i = 0; i < intArray.length; i++) {         // 높이
        for (int j = 0; j < intArray[i].length; j++) {      // 각 높이에 위치한 너비
                intArray[i][j] = (i+1)*10 + j;              // [1] i가 0부터 시작하기때문에 i+1 로 바꿔서, 1*10 = 10 으로 만들어줌
                                                            // 10이 된 값에 옆으로 갈때마다 j 가 증가함 (그래서 10, 11 , 12 가 나옴)
                
                System.out.print( intArray[i][j] +" ");     // 그거를 출력함
            }
            System.out.println();                           // 한줄단위로 줄바꿈
        }
        */


        // 강사님 ver

        int[][] n = new int[4][];

        n[0] = new int[3];
        n[1] = new int[2];
        n[2] = new int[3];
        n[3] = new int[2];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = (i+1)*10 + j;
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }


    }
}
