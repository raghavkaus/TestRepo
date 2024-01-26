package CollectionFramework;
import java.util.HashSet; 
public class HashSetExample1 {

	public static void main(String[] args) {
		// HashSet<Object> hs = new HashSet<>(); // For heterogeneous data
	        HashSet<String> cars = new HashSet<>();
	        HashSet<String> cars2 = new HashSet<>();// For homogeneous data (specifically, strings)

		// TODO Auto-generated method stub
	        //Insert element//
	        cars.add("Volvo");
	        cars.add("BMW");
	        cars.add("Maruti");
	        cars.add("Faord");
	        
	        System.out.println("Element of Hash Set:" + cars );
	        
	        //Insert element in cars2 collection//
	        cars2.addAll(cars);
	        System.out.println(cars2);
	        
	        //Remove method//
	        cars.remove("Volvo");
	        System.out.println("Element of Hash Set After Remove method:" + cars );
		    cars2.removeAll(cars);
		    System.out.println(cars2);
		    //Contains//
		    System.out.println(cars2.contains("Volvo"));
		    System.out.println(cars2.containsAll(cars));
		    //Size
		    System.out.println(cars2.size());
		

	for(String e2:cars) {
		System.out.println(e2);
			
	}
}
}

