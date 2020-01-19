package Day3;

public class LargestOf3Numbers {

	public static void main(String[] args) {


		int a = 50;
		int b = 100;
		int c = 30;
		
		// nested if- else
		
		if(a>b && a>c){
			System.out.println("a is Largest");
			
		}
		else if(b>a && b>c){
			System.out.println("b is Largest");
			
		}
		else{
			System.out.println("c is Largest" );
		}
	}

}
