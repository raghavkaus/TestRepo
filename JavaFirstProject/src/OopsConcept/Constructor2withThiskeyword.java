package OopsConcept;

class Constructor2withThiskeyword {
	
	String name;
	int emp_id;
	Constructor2withThiskeyword(String name,int emp_id){
		
		this.name=name;
		this.emp_id=emp_id;
		
		
	}
	
	

	public static void main(String[] args) {
		
		Constructor2withThiskeyword E2=new Constructor2withThiskeyword("Rgahav",10);
		Constructor2withThiskeyword E21=new Constructor2withThiskeyword("Pankaj",90);
		System.out.println(E2.emp_id  + " " +E2.name);
		
		
		// TODO Auto-generated method stub

	}

}
