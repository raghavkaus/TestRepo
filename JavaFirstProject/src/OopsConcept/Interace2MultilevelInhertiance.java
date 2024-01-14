package OopsConcept;


	
	interface I80{
		void show(); 
		}
	interface I2{
		void display(); 
		}
	
	public class Interace2MultilevelInhertiance implements I1,I2 {
	
		
		public void show() {
			System.out.println("1");
		}
		public void display() {
			System.out.println("12");
		}
		public static void main(String[] args) {
			
			Interace2MultilevelInhertiance f2 =new Interace2MultilevelInhertiance();
			f2.show();
			f2.display();
		// TODO Auto-generated method stub

	

}
}