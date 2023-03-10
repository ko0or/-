public class Ex3_10 {
/*
4년 전체 평점(평균 학점)의 평균 구하기
2차원 배열 이용해서 원소로 초기화
1행1열부터 4행 2열까지
legth 필드 이용 (행/열의 크기)
*/
    public static void main(String[] args) {
        
        double sum = 0;
        double score[][] = /* 높이 4 x 너비 2 공간크기 */
        {
            /* 각 학년마다 1학기, 2학기 값을 넣어줘야한다. ----------> */
            { 3.3, 3.4 } , // 1학년 ( 1학기 3.3, 2학기 3.4 학점 )
            { 3.5, 3.6 } , // 2학년 ( 1학기 3.5, 2학기 3.6 학점 )
            { 3.7, 3.8 } , // 3학년 ( 1학기 3.7, 2학기 3.8 학점 )
            { 3.9, 4.0 }   // 4학년 ( 1학기 3.9, 2학기 4.0 학점 )
        };

        for (int i = 0; i < score.length; i++)    { // score.length: 4 (높이)
        for (int j = 0; j < score[i].length; j++) { // score[i].length : 2 (i 높이에있는 너비)
            sum += score[i][j];
        }
        }

        // 반복이 끝나면 4년 전체 (8학기)의 총 평점의 합계가 누적됨
        // sum/8 대신 length 사용
        int row = score.length;         
        int column = score[0].length;

        System.out.println("4년 전체 평점 평균은 " + sum / (row * column) );

        

    }
}
