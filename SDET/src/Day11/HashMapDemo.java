package Day11;

import java.util.HashMap;
import java.util.Map;

/*HashMap
----------
declare HASH MAP
add pairs to hash map
remove pairs from hash map
read pairs from hash map */


public class HashMapDemo {

	public static void main(String[] args) {
		
//		Declare HASH MAP:
		HashMap<Integer, String> hm= new HashMap<Integer, String>();  // Hash Map contains Keys & Values

//		Adding pairs to hash map:
		hm.put(101,"David");        // emp no- Integer type and emp name- String type
		hm.put(102,"Scott");
		hm.put(103, "John");
		hm.put(104,"Smith");
		hm.put(105,  "Kim");
		
		System.out.println(hm);   //Prints all the pairs in hm
		
//		Remove pairs from hash map:
		
		/*hm.remove(103);
		System.out.println(hm);*/ //Prints new pairs after remove method
		
//		Read pairs from hash map:
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
