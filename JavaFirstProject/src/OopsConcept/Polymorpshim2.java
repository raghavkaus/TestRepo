package OopsConcept;

public class Polymorpshim2 {
	
	void pull() {
		
	System.out.println("I am pulling the request");	
	}

}

class Polymorpshim31 extends Polymorpshim2{
	  
public void pull() {
			
			System.out.println("I am in Rush");	
			}
	public static void main(String[] args) {
		Polymorpshim2 f2  =new Polymorpshim2();
		f2.pull();
		Polymorpshim31 f3= new Polymorpshim31();
		f3.pull();
	
		
		}
}
  //Final,Static and private members can not be overridden.//