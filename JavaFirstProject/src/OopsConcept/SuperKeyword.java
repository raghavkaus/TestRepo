package OopsConcept;

public class SuperKeyword {
	
	void show() {
		System.out.println("I am playing");
		
	}
static	public class T3 extends SuperKeyword{
		void run() {
			System.out.println("I am running");
			super.show();
			//With the help of super keyword by child class object we can call parent class method//
		}

		
	public static void main(String[] args) {
		
		T3 e2 =new T3();
		e2.run();

		// TODO Auto-generated method stub

	}

}

}
