package Day6;

public class Calculation {
int x=100,y=200;

//case1: Not taking parameters, not returns output
           /* void sum(){
			System.out.println(x+y);
		}*/

//case2 :Not taking parameters, returns output

        /* int sum(){
        	 return(x+y);
         }*/

//case3 :Taking parameters ,not returns output

/*void sum(int a,int b){
	x=a;
	y=b;
	System.out.println(x+y);
}*/

//case4 :Taking parameters, returns output

int sum(int a,int b){
	x=a;
	y=b;
	return(x+y);
}

  public static void main(String[] args) {
	  Calculation cal = new Calculation();
	  // cal.sum();                           ---> for case1
	 /* int res= cal.sum();
	  System.out.println(res);                ---> for case2  */
	
 //cal.sum(10,20);                            ---> for case3
  
	  int res=cal.sum(10, 20);
	  System.out.println(res);              // --> for case4
  
  }

}
