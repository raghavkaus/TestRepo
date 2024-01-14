package OopsConcept;

public abstract class  Abstraction1 {

	abstract void start();
	//Abstraction can be achieved by -
	
//	1.abstract class
//	2.Interfaces//100% v//
// 3.For abstract class we cant create any objects//
	
}
class fun extends Abstraction1{ 

	public static void main(String[] args) {
		fun d2 =new fun();
		d2.start();
		// TODO Auto-generated method stub

	}

	@Override
	void start() {
		System.out.println("I am playing");
		// TODO Auto-generated method stub
		
	}


}