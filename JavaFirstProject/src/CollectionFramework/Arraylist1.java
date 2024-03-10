package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<String>a1=new ArrayList<String>();
		// TODO Auto-generated method stub
		a1.add("Tanu");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		ArrayList<String>a12=new ArrayList<String>();
		a12.addAll(a1);
		System.out.println("after adding:" +  a12);
		//1.Loop through element of array list//
		//for(int i=0;i<a12.size();i++) {
			//	System.out.println(a12.get(i));//
		//}//
//Using for each loop//
		//for(String i:a1) {
			
			//System.out.println(i);
			
//}//
	
		//Before sorting//
		System.out.println("Before sorting:"  + a12);
	  Collections.sort(a12);
	  //After sorting//
	  System.out.println("After sorting:"  + a12);
	  //Create String array//
	 String[]cars= {"Volvo","Car","Lion"};
	 ArrayList a13=new ArrayList(Arrays.asList(cars));
	 System.out.println(a13);
	  }
}

