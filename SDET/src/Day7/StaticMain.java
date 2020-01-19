package Day7;

public class StaticMain {

	public static void main(String[] args) {
		
//		 1) Static Methods can only access Static things like static Methods and Static Variables
		 System.out.println(StaticExample.a);
		 StaticExample.m1();
		 //System.out.println(b)         //incorrect , b is a non static variable
		 //m2();                         // m2 is a non static method


		 StaticExample se= new StaticExample();
		 System.out.println(se.b);          // 2) Static method can only access the non static stuff through objects
		 se.m2();


		 se.m3();
	}

}
