package Day6;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu1= new Student();     // stu1 is the object reference variable

		//	Approach 1:	Assigning values using object reference variable
		
//		stu1.sid= 100;
//		stu1.sname= "Swet";
//		stu1.grade='A';
		
//	Approach 2: Using Methods and assigning values.	
		
		
//		stu1.getValues(100,"Swet",'A');
		
//		Approach3: Using Constructors and Assigning Values
		
		
		Student stu1= new Student(100,"Swet",'A');
		stu1.display();
	}

}
