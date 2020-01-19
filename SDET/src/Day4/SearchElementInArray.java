package Day4;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		int a[]={100,300,500,700,900,1100};

		int num=101;
		boolean flag =false;
		for(int i:a){
			//System.out.println(i);
			if(i==num){
				System.out.println("Element Found");
				flag= true;
				break;
			}
		}
		if(flag==false){
			System.out.println("Element not Found");	
		}
		
		
	}

}
