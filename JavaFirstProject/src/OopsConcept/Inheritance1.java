package OopsConcept;

public class Inheritance1 {
	
public void swim() {
	
	System.out.println("I am swiming");
}
int h=9;

	public static void main(String[] args) {
		
		System.out.println("TOO");
		// TODO Auto-generated method stub

	}
	
static	class Inheritance2 extends Inheritance1 {
		
		public void run() {
			
			System.out.println("I am running");
		}
			public static void main(String[] args) {
				
				Inheritance2 r3=new Inheritance2();
				Inheritance1 e2 =new Inheritance1();
				r3.swim();
				r3.run();
				e2.swim();
				System.out.println(r3.h);
}

}
	
}