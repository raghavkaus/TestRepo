package OopsConcept;

public class Encapsulation1 {
	
	private int empid;
	
	public void setempid(int eid)
	{
		
		empid=eid;
	}
	
	public int getEmpid() {
		return empid;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class Encapsulation2 {
		public static void main(String[] args) {
			
			Encapsulation1 e2=new Encapsulation1();
			e2.setempid(30);
			System.out.println(e2.getEmpid());
			
		
			// TODO Auto-generated method stub

		}
		
//Steps to achieve encapsulation//
	//1.Declare the varible of a class as private//
	
	//2.Provide public setter and getter values to modify the variable values//
	

}
}