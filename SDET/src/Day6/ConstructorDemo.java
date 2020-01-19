package Day6;

public class ConstructorDemo {
int x,y,z;
	ConstructorDemo(){           //Default Constructor --> means no parameters
		 x=100;
		 y=200;
		System.out.println(x+y);
	}
	
	ConstructorDemo(int a,int b){           //Parameterized Constructor  --> takes 2 parameters
		 x=a;
		 y=b;
		System.out.println(x+y);
	}
	
	ConstructorDemo(int a,int b,int c){           //Parameterized Constructor  --> takes 3 parameters
		 x=a;
		 y=b;
		 z=c;
		System.out.println(x+y+z);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo cd= new ConstructorDemo(10,20,30);
		
	}

}
