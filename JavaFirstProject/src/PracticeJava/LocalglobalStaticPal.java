package PracticeJava;

public class LocalglobalStaticPal {
	
 int y=90;//Instance variable
 static int z=90;//Static variable
	
	void test()
	{
	int a=90;
	System.out.println(y);
	System.out.println(z);
	}

	public static void main(String[] args) {
		LocalglobalStaticPal b2=new LocalglobalStaticPal();
		System.out.println(b2.y);
		System.out.println(z);
		
		
		
		
	
		// TODO Auto-generated method stub

	}

}
