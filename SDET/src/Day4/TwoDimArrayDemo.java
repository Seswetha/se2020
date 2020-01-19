package Day4;

public class TwoDimArrayDemo {

	public static void main(String[] args) {
		
		/*1. Declare an array
		  2.Insert the values into array
		  3.Find the size of an array
		  4.Read values from an array  */
		
		
		/*int a[][]= new int[3][2];
		
	    a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		int a[][]= {{100,200},{300,400},{500,600}};  //Dynamic Array
		System.out.println("Number of Rows :" +" "+ a.length);    
		System.out.println("Number of Columns :" +" "+ a[0].length); 
		
		/*for(int i=0;i<a.length;i++){               //i represents row index
			for(int j=0;j<a[0].length;j++){        //j represents column index
				
				System.out.print(a[i][j]+" ");
				
			}System.out.println();
		}
		*/
//		Enhanced For Loop:
		
		for(int r[]:a){
			for(int i:r){
				System.out.print(i+" ");
				
}
			System.out.println();
		}
	}
	

}
