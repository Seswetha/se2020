package Day8;

class Bank{
	
	
	double rateOfInterest(){
		return 0;
	}
}

class SBI extends Bank{
	
	double rateOfInterest(){
		return 10.5;
	}
}

class ICICI extends Bank{
	double rateOfInterest(){
		return 12.5;
	}
}



public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		SBI sbiobj = new SBI();
	System.out.println(sbiobj.rateOfInterest());	
	
	ICICI iciciobj= new ICICI();
	System.out.println(iciciobj.rateOfInterest());
		

	}

}
