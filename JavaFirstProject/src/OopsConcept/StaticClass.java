package OopsConcept;

public class StaticClass {
	
	static void display() {
		System.out.println("I am playing");
		
	}

	public static void main(String[] args) {
		
		StaticClass.display();
		display();
		StaticClass2.display2();
		//If the method is static we can call directly or with the help of class name //
		//If the method is static we can not  call directly if belongs to different class we call only with the help of class name //
		
		// TODO Auto-generated method stub
		}
	public class StaticClass2 {
		static void display2() {
			System.out.println("I am playing2");
			
		}
public static void main(String[] args) {
			
			
			//If the method is static we can call directly with the help of class name//
			
			// TODO Auto-generated method stub
	}
		
	}
}
	


