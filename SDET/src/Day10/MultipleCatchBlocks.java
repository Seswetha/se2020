package Day10;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		
//		Arithmetic Exception
		
		
		int a=100;   //try-catch for Exception Handling
		
		/*try{
//		System.out.println(a/0);   // ArithmeticException
		String s= "Welcome";          
		int n=Integer.parseInt(s); //NumberFormatException
		}
		
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException occurred ... and Handled successfully");
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException occurred ... and Handled successfully");
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException occurred ... and Handled successfully");
		}*/
		
		
		
		try{
			//System.out.println(a/0);   // ArithmeticException
			
			String s= "Welcome";          
			int n=Integer.parseInt(s);
}
		
		
		catch(Exception e){
			System.out.println("Exception occurred ... and Handled successfully");
		}
		

		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
