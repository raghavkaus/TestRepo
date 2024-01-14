package CollectionFramework;

import java.util.ArrayList;

public class Arraylist {
//List-allows Duplicate objects//
//Insertion is preserved//	
//Resizable//
	
//	Declaration of array list//
	
	//Array list al =new Array list();//
	
	//Specefic type of declaration in array//
	//Arraylist<String>refernce variable=new Array list<>4
	
	public static void main(String[] args) {
		
		//Declare Array list//
		ArrayList g2= new ArrayList();//for hetrogenuos data type//
		//Add data to array list//
		g2.add("Ram");
		g2.add(9);
		g2.add(10.6);
	    g2.add(true);
	    g2.add('j');
		
		System.out.println(g2.size());
		
		//Print array list//
		System.out.println(g2);
		//Remove arraty list//
	g2.remove(1);
	System.out.println("After removing: 9" + g2);
	System.out.println(g2.get(2));
	//Set method -used to replace /change element of array list//
	g2.set(1, "10.9");
	System.out.println(g2);
	//Insert element in array list//
	g2.add(2, "False");
	System.out.println(g2);
	System.out.println(g2.contains("Ram1"));
	
		// TODO Auto-generated method stub

	}
}
