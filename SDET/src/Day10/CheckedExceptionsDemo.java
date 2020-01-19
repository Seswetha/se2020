package Day10;

public class CheckedExceptionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
	/*	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}*/
		
		Thread.sleep(5000);
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");


	}

}
