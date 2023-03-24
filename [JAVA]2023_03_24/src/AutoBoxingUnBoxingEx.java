public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		
		// BOXING, AUTO-BOXING
		int n = 10;
		Integer intOBJECT = Integer.valueOf(n);
		Integer intOBJECT2 = n;
		System.out.println("intObject = " + intOBJECT);
		System.out.println("intObject2 = " + intOBJECT2);
		
		// UN-BOXING,  AUTO-UN-BOXING
		int m = intOBJECT + intOBJECT.intValue();
		System.out.println("m = " + m);		
		
		
	}
}
