package javaBasics;

public class Operators {

	

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// Arithmetic Operators   +, -, *, /, %
		
		System.out.println("The sum of a and b is : " + (a+b));
		System.out.println("The diff of a and b is : "+ (a-b));
		System.out.println("The mul of a and b is : " + (a*b));
		System.out.println("The div of a and b is : " + (a/b));
		System.out.println("The modulus of a and b is : "+ (a%b));

		
		/*Relational Operators/ Comparison operators -always return a boolean value(true/ false)
		  
		 < , <=, >, >=, == , !=
		 
		 * */
		
		
		System.out.println(a<b);//true
		System.out.println(a<=b);//true
		System.out.println(a>b);//false
		System.out.println(a>=b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		//Logical Operators-->    &&, ||, !       also returns boolean value -->True/False

		boolean x = true;
		boolean y = false;
		
		
		System.out.println(x && y);  //false
		System.out.println(x || y);  //true
		System.out.println(!x);      //false
		
		String s= (x== true ? "true":"false");  //Ternary operator  --> shorthand if-else
		System.out.println(s);
		
		
		//  Increment & Decrement Operator
		
		 a= 100;
		//int res = a++;             post-increment
		//int res = ++a;             pre-increment
		
		System.out.println(a++); //100 101
		System.out.println(++a); //102
		
		b=100;
		//int res = b--; //100 
		//int res = --b; //99
		
		
		System.out.println(b--); //100 99
		System.out.println(--b); // 98
		
		
		
	}

}
