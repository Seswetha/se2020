package Day3;

public class JumpingStatements {

	public static void main(String[] args) {
	
		/*Break Statement:
		 * 
		 * for(int i=1;i<=10;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
	}*/

		
		//Continue Statement:
		
		for(int i=1;i<=10;i++){
			if(i==5 ||i==7 ||i==9){
				continue;
			}
			System.out.println(i);
			
		}
}
}

