package OopsConcept;


	// Interface
	interface Shape {
	    void draw();
	}

	// Class implementing the interface for a Circle
	class Circle implements Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a circle");
	    }
	}

	// Class implementing the interface for a Square
	class Square implements Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a square");
	    }
	}

	// Class implementing the interface for a Triangle
	class Triangle implements Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a triangle");
	    }
	}

	public class InterfaceReferenceExample {
	    public static void main(String[] args) {
	        // Using interface reference to hold an object of implementing class (Circle)
	        Shape circle = new Circle();
	        
	        // Calling the draw method through the interface reference
	        circle.draw();

	        // Switching to a different shape (Square) without modifying the rest of the code
	        circle = new Square();
	        circle.draw();

	        // Switching to another shape (Triangle) without modifying the rest of the code
	        circle = new Triangle();
	        circle.draw();
	    }
	}

