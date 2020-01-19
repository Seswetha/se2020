package Day4;

public class SingleDimArrayDemo {

	public static void main(String[] args) {
		
		/* 1.Declare an Array
		 * 2.Insert the values into array
		 * 3.Find the size of an array
		 * 4.Read values from an array  */
		
		
		//static array:
		
		/*int a[] = new int [5];//declaring an array
		
		a[0]=100;  //insert the values into array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int a[] ={100,200,300,400,500};  //Declared array without specifying the size --> Dynamic Array
		
		System.out.println(a.length);// The size/Length of an array
		
		
		//System.out.println(a[2]); //Extracts/Read single(specific) values from an array

	//classic for loop:
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	
	//for each loop/ Enhanced for loop:
		
		for(int i:a){
			System.out.println(i);
		}
	
	
	}

}
