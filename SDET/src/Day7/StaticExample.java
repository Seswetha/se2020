package Day7;

public class StaticExample {

	static int a=10;           //Static Variable
	int b=20;                  //Non Static Variable    
	
	static void m1(){          //Static Method
		System.out.println("This is m1 static method");
	}
	
	void m2(){                 //Non Static Method
		System.out.println("This is m2 non static method");
	}
	
//	3) Non- Static methods can access everything directly.
	void m3(){
		System.out.println(a);//static variable
		System.out.println(b);//non-static variable
		m1();// Static Method
		m2();// Non Static Methos
	}
	
	
	
	
	
	
	
/*	public static void main(String[] args) {
		
//  1) Static Methods can only access Static things like static Methods and Static Variables
System.out.println(a);
m1();

//System.out.println(b)         //incorrect , b is a non static variable
//m2();                         // m2 is a non static method


StaticExample se= new StaticExample();
System.out.println(se.b);          // 2) Static method can only access the non static stuff through objects
se.m2();


se.m3();
	}   */                       

}
