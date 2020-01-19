package Day10;

import java.util.Scanner;

public class ExceptionExamples {

	//private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		
//		Arithmetic Exception
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");    // If we divide the number by 0, it will throw a Arithmetic Exception
		
		int num=input.nextInt();
		
		int a=100;   //try-catch for Exception Handling
		
		try{
		System.out.println(a/num);
		}
		catch(ArithmeticException e){
			System.out.println("Exception occurred ... and Handled successfully");
		}

		
		
		
		
		
		//		NumberFormatException:
		/*String s= "12345";           // if you give string "welcome" here...
		int n=Integer.parseInt(s); //it will throw a NumberFormat Exception as it is the wrong format of the variable
		System.out.println(n+100);*/
		
//		NullPointerException:
   /* String s ="Welcome";              // If we have a  Null value in any variable
	System.out.println(s.length());*/   // it will throw a NullPointer Exception
	
//	ArrayIndexOutOfBoundsException:
	/*int a[]= new int[5];    //it accepts index until n-1 index
	a[10]=100;*/              //if we insert wrong index, it throws a ArrayIndexOutOfBounds Exception
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
