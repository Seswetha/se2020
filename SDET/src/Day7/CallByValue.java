package Day7;

public class CallByValue {  
	
	int x;
	
	public void addition(int a){
		x= a+5;
//		System.out.println(a);
		
	}

	public static void main(String[] args) {
		CallByValue cv= new CallByValue();
		
		cv.addition(10);       // Call by value : we have to pass a value to a method as a parameter
		System.out.println(cv.x);
			
		
	}

}
