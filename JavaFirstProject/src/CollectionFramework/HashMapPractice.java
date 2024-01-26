package CollectionFramework;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create Hashmap in Java//
		HashMap<Integer,String>ab =new HashMap<Integer,String>();
		ab.put(9, "Raghav");
		ab.put(18, "Pu");
		ab.put(11, "JAS");
		
		System.out.println(ab);
	   String ab2 = ab.get(9);
	   System.out.println(ab2);
	  //Keyset//
	   System.out.println(ab.keySet());
	   //Values//
	   System.out.println(ab.values());
	   //Language Entry Set//
	   System.out.println(ab.entrySet());
	   //Replace element//
	   System.out.println(ab.replace(18, "ab2"));
	   System.out.println(ab);
	   //Remove method from Hashmap//
	   ab.remove(11);
	   System.out.println(ab);
	   //Contains method//
	   System.out.println(ab.containsKey(9));
	   System.out.println(ab.containsValue("JAS2"));
	   System.out.println(ab.size());
	   System.out.println(ab.isEmpty());
	   HashMap<Integer,String>at4 =new HashMap<Integer,String>();
	   at4.putAll(ab);
	   System.out.println(at4);
		
	}

}
