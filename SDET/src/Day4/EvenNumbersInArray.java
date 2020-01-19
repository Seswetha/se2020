package Day4;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		
int a[]={10,15,20,25,30,35,40,45,50};
System.out.println("Even numbers are..........");
for(int i:a)
{
	if(i%2==0){
		System.out.println(i);
	}
}
System.out.println("Odd numbers are..........");
for(int i:a)
{
	if(i%2!=0){
		System.out.println(i);
	}
}


	}

}
