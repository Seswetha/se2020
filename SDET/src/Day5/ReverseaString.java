package Day5;

public class ReverseaString {

	public static void main(String[] args) {
		
		String s ="selenium"; //index is 0-7
		
		int len= s.length();//8
		
		String rev ="";
		
		for(int i=len-1;i>=0;i--) // 76543210 so decrement operator
		{
			rev= rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
