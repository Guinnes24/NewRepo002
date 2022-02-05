
/*
 * Today’s task is create A Student class like Employee with 
 * student name, roll_no, mobile, department, college name
 */

public class oops01 {

	public static void main(String[] args) {
		
		student json = new student("json", "Mech" , "Anna University", 98765445);
		student karthik = new student("karthik", "EC", "Anna University", 123456890);
		
		json.student1();
		karthik.student1();
	}

}

class student{
	
static int Roll_No = 9001;

	String name, department, college  ; 
	
	long mobile;
	
static {
		
		System.out.println("Student Record");
		Roll_No = 9001;
	}

	
student (String Name, String Department, String College, long Mobile) {

System.out.println( Name  + " ");

name = Name;
department = Department;
college = College; 
mobile = Mobile;
Roll_No = Roll_No++;

} 


void student1 () {

System.out.println( "Roll_No: " + Roll_No++);
System.out.println( "Name: " + name); 
System.out.println( "Mobile: " + mobile); 
System.out.println( "Department: " + department); 
System.out.println( "College: " + college); 


}
}