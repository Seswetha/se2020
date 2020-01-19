package Day8;

public class FinalVariableDemo {

	final int speed= 100;
	public static void main(String[] args) {
		
		 FinalVariableDemo fv= new  FinalVariableDemo();
//		 fv.speed= 200;  //you cannot change the value of variable when it is declared "final".
		 System.out.println(fv.speed);
		
	}

}
