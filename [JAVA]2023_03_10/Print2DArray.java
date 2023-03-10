public class Print2DArray {
    public static void main(String[] args) {
        
        // 내가 작성한 코드

        /*
        // 높이 너비가 일치하지않는 배열  (높이는 5)
        int n[][] = {
            {1},
            {1,2,3},
            {1},
            {1,2,3,4},
            {1,2}
        };

        for (int i = 0; i < n.length; i++)    { // n.length : 높이 5
        for (int j = 0; j < n[i].length; j++) { // n[i].length : i 번째 높이의 너비길이
            System.out.print(n[i][j] + " "); 
            }
            System.out.println();              // 한줄마다 줄바꿈
        }
        */


        // 강사님 ver

        int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
        
        // n.length : 5 
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                //n[0].length = 1,  n[1].length = 3 ...  n[4].length = 2
                System.out.println(n[i][j]+" ");
            }
        }

    }
}
