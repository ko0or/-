
public class ReturnArray2 {
	public static void main(String[] args) {
		

//		// 내가 작성한 코드 
//		int intArray[] = new int[10];
//		for (int i = 0; i < intArray.length; i++) { 	intArray[i] = i + 1; }
//		
//		intArray = arrayReturn(intArray);
//		for (int i : intArray) { System.out.print(i + " "); }
//		
//		
//		
//	}
//
//	static int[] arrayReturn(int[] getArray) {
//		for (int i = 0; i < getArray.length; i++) { getArray[i] += 100; 	}
//		return getArray;
//	}
//	
//}

		
		
		
		
		// 강사님 ver
		
		int intArray[];
		intArray = makeArray();
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print( intArray[i]+100 + " " );
		}
		
	}
	static int[] makeArray() {
		int temp[] = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1;
		}
		return temp;
	}
	
}