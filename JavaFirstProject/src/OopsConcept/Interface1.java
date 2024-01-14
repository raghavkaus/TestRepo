package OopsConcept;

interface I1{
	public	void show();
		
		int a=90;
		
	}

public class Interface1 implements I1{
	
	public void show() {
        System.out.println("Implementing show method");
        
	}
	//Interface is used to achieve abstraction.
	//Interface is used to multiple inheritance//
	//All field in Interface must be public static final//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		Interface1 b2 =new Interface1();
		b2.show();

	}
	

}
