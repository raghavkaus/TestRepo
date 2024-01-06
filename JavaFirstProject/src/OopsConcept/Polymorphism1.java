package OopsConcept;

public class Polymorphism1 {

	public void run() {
		
		System.out.println("I am running");
		
		
	}
  public  void run(int a) {
		
		System.out.println("I am running 2");
		System.out.println(a);
		
		
		
	}
	public static void main(String[] args) {
		
		Polymorphism1 t2 =new Polymorphism1();
		t2.run(10);
		
		// TODO Auto-generated method stub

	}

}
