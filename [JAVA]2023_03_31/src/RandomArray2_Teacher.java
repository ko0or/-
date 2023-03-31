import java.util.Random;

import java.util.Scanner;



public class RandomArray2_Teacher {

//	배열과 난수의 값을 비교, array->a로 받음

	public static boolean exists(int a[], int from, int r) {


		for (int i = 0; i < from; i++) {

			if (a[i] == r) {

				return true;//중복발생

			}

		}

		return false;//중복아님

	}

	public static void main(String[] args) {
		
		//강사님 

		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 몇개? ");

		int n = scanner.nextInt();

		int array[] = new int[n];



		for (int i = 0; i < array.length; i++) {

			int r = (int)(Math.random()*100+1);//1~100까지 난수 발생

			//난수를 배열에 넣을때 중복체크

			if (exists(array, i, r)) {//i는 0,1,2...99

				i--;//없으면 중복이 5번 발생하면 95개 출력

				continue;

			}

			array[i]=r;//난수를 배열에 저장

		}

		

		for (int i = 0; i < array.length; i++) {

			if (i == 0) {

				System.out.print(array[i]+" ");

			} else {

				if (i%10 == 0) { 

					System.out.println();

				}

				System.out.print(array[i]+" ");

			}

		}

	}

}