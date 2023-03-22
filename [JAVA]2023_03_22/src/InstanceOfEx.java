/* instanceof 연산자 사용 + 상속 */
class Person {
	
	
}

/* Person을 상속받은 클래스들 (Student,  Researcher,  Professor) */
class Student extends Person {
	
}

class Researcher extends Person {
	
}
class Professor extends Person {
	
}

public class InstanceOfEx {
	
	static void print(Person p) { // Person p에는 new Student() 가 오게됨으로 -> 업캐스팅
		
		// 매개변수로 받은 객체가 Person 타입인지 ?
		if (p instanceof Person) { System.out.print("Person "); }
		
		// 매개변수로 받은 객체가 Student 타입인지 ?
		if (p instanceof Student) { System.out.print("Student "); }
		
		// 매개변수로 받은 객체가 Researcher 타입인지 ?
		if (p instanceof Researcher) { System.out.print("Researcher "); }
		
		// 매개변수로 받은 객체가 Professor 타입인지 ?
		if (p instanceof Professor) { System.out.print("Professor "); }
		
		// 줄바꿈용
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.print("new Student()->\t");			print( new Student() );
		System.out.print("new Researcher()->\t");		print( new Researcher() );
		System.out.print("new Professor()->\t");		print( new Professor() );
		
	}
}
