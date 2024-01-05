package OopsConcept;

public class UsingMethodobjectintialization {
	
	String colour;
	int age;
	void intobj(String C,int a)
	{
		colour=C;
		age=a;
	}
	void display() {
		System.out.println(colour  +  " " + age);
	}

	public static void main(String[] args) {
		
		UsingMethodobjectintialization a12 ;
		a12=new UsingMethodobjectintialization();
		a12.intobj("Red", 20);
		a12.display();
		// TODO Auto-generated method stub

	}

}
