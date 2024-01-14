package OopsConcept;

public class Thiskeyworduse {
	int i;
	
	
		void setvalue(int i) {
		this.i=i;
		
	}
	void show() {
		
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		Thiskeyworduse d2 =new Thiskeyworduse();
		d2.setvalue(19);
		d2.show();
		// TODO Auto-generated method stub

	}

}

