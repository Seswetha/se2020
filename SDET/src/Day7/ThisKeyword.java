package Day7;

public class ThisKeyword {  //If there is ambiguity between the instance variables and parameters, 
                           //	this keyword resolves the problem of ambiguity.
	
	int a,b; //Class variables/ Instance variables / Global Variables
	
//	Using Method:
    /*    void add(int a,int b){   //Method variables / Local Variables / External Variables
		this.a= a;
		this.b= b;                  //In the above example, parameters (formal arguments) and instance variables are same. 
		                            //So, we are using this keyword to distinguish local variable and instance variable.
		}*/
	
//	Using Constructor:The this() constructor call can be used to invoke the current class constructor. 
                     //	It is used to reuse the constructor. In other words, it is used for constructor chaining.
	
	ThisKeyword(int a, int b){
		
		this.a= a;
		this.b= b;
		
	}
	
	
	void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println("Sum of a and b:" +" "+(a+b));
		
		}
	
	public static void main(String[] args){
	ThisKeyword th= new ThisKeyword(10,20);
//	th.add(10,20);
	th.display();
	
}
}
