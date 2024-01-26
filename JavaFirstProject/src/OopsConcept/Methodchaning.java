package OopsConcept;

public class Methodchaning {

	//This concepts mainly used in Selenium//
		
		public static class Person {
		    private String name;
		    private int age;

		    // Constructor
		    public Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		    // Method to set the name and return the Person object for chaining
		    public Person setName(String name) {
		        this.name = name;
		        return this;  // Return the Person object for method chaining
		    }

		    // Method to set the age and return the Person object for chaining
		    public Person setAge(int age) {
		        this.age = age;
		        return this;  // Return the Person object for method chaining
		    }

		    // Method that takes another Person object and displays information about both persons
		    public void displayInfoWithFriend(Person friend) {
		        System.out.println("Person 1 - Name: " + this.name + ", Age: " + this.age);
		        System.out.println("Person 2 - Name: " + friend.name + ", Age: " + friend.age);
		    }

		    public static void main(String[] args) {
		        // Create two Person objects using constructor
		        Person person1 = new Person("John", 25);
		        Person person2 = new Person("Alice", 30);

		        // Use method chaining to set values and display information
		        person1.setName("Bob").setAge(28).displayInfoWithFriend(person2);
		    }
		}
		
		// TODO Auto-generated method stub

	}


