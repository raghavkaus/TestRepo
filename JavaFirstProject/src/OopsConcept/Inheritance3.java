package OopsConcept;

public class Inheritance3 {
	
	public void play() {
		
		System.out.println("I am playing cricket");
	}
	
static	class Inheritance2 extends Inheritance3{
		public void eat() {
			
			System.out.println("I am eating food");
			}
		}
static	class Inheritance4 extends Inheritance2{
		public void sleep() {
			
			System.out.println("I am sleeping");
		}
		
		
	}

	public static void main(String[] args) {
		Inheritance4 d3 =new Inheritance4();
		d3.play();
		d3.eat();
		d3.sleep();
	}
}