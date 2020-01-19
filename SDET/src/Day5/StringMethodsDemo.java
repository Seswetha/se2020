package Day5;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String s= "Welcome";
		
		System.out.println(s.length());// length--> returns the number of characters in a String.
		
//		concat(): Join two/more strings
		
		String s1= "Welcome";
		String s2= "to Selenium";
		
//		System.out.println(s1+" "+s2);
		
		System.out.println(s1.concat(s2));
		
//		trim(): trim method removes extra spaces.
		
		 String s3= "    java programming               ";
			System.out.println(s3.trim());	
			
//			charAt(): returns a char value at the given index number. Index will start from 0
			
			s="Welcome";
		System.out.println(s.charAt(3));   //c
		
		
//		contains(): Searches the sequence of characters in the string. It returns true if sequence of char values found,
//	otherwise false. It is case sensitive.
	
	System.out.println(s.contains("come"));// returns true
	System.out.println(s.contains("Come"));// returns false
	
//	Substring()--> Returns substring of a string based on the starting index and ending index
	
	System.out.println(s.substring(1, 4)); // elc
	
	
//	toLowerCase() & toUpperCase(): 
	
	s="WELCOME";
	System.out.println(s.toLowerCase());
	
	s="welcome";
	System.out.println(s.toUpperCase());
	}

}
