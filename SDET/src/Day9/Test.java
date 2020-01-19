package Day9;

interface A{
	int a=10;            //By default, in interface the variables are static and final
	void m1();           // by default, the abstract method is public
}


public class Test implements A{
	public void m1(){
		System.out.println(a);
	}

	public static void main(String[] args) {
		A obj = new Test();                           // This is for interface.
		//Test obj= new Test();                       //Can use either one. this is for class.
		obj.m1();
	}

}
