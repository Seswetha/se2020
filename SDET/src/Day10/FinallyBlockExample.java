package Day10;

public class FinallyBlockExample {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		
//		Arithmetic Exception
		
		
		int a=100;   //try-catch for Exception Handling
		
		try{
	System.out.println(a/2);  // ArithmeticException
		}
  catch(ArithmeticException e){
			System.out.println("ArithmeticException occurred ... and Handled successfully");
		}	
finally{
	System.out.println("This is finally block");
}
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

	}


