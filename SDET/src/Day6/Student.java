package Day6;

public class Student {
	
	//Class Variables:
	int sid;
	String sname;
    char grade;
    
    Student(int id,String name,char g){
    	sid= id;
    	sname= name;
    	grade= g;
    }
    
    void getValues(int id,String name,char g){ // No need to comment it
    	sid= id;                               // as it does not invoke 
    	sname= name;                          // until its getValues method
    	grade= g;                             // is called.
    }
   
//    Class Method:
    void display(){
    	System.out.println(sid);
    	System.out.println(sname);
    	System.out.println(grade);
    }
}
