package Day11;

import java.util.ArrayList;

/* How to declare array list
how to to add elements/values to array list
Find size of array list
insert a new element in the middle of array list
remove elements/values from array list
read all the values from array list */

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list =new ArrayList();   //Declare array list
		
//		how to to add elements/values to array list:
		
		list.add("Welcome"); //can add any data type values
		list.add(10);
		list.add(10.5);
		list.add('a');
		list.add(true);

//		Find size of array list:
		
		System.out.println(list.size());
		
        System.out.println("Initial list of values in ArrayList"+"   "+list);         //returns all the values from the array list
		
//		Returns the value of the specific index
		System.out.println(list.get(1));
		
//		insert a new element in the middle of array list:
		
		list.add(1,"Selenium");
		
		System.out.println("List of values in ArrayList after inserting new value "+"    "+list); 

//		Remove elements/values from array list:
		
		list.remove(3);  //removes elements/values based on the index number.
		System.out.println("List of values in ArrayList after the remove"+"   "+list); 
		
//		read all the values from array list
		
		for(Object i:list){
			
			System.out.println(i);
		}
		
	}

}
