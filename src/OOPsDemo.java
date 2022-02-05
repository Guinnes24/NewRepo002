

public class OOPsDemo {

	public static void main(String[] args) {
		
		Employee king = new Employee("King", 12345678, "King@gmail.com");
		
		Employee vijay = new Employee("Vijay", 78946513, "Vijay@gmail.com");
		
		king.id();
		vijay.id();
		Employee.empDetails(king, vijay);

	}

}

class Employee{
	
	//Class Variable
	static int idGenerate;
	
	//Instance Variables
	String name, email;
	int id;
	long mobile;
	
	static {
		
		System.out.println("ID is initialized in static block");
		idGenerate = 1001;
	}
	
	Employee(){
		
	}
	
	Employee(String name, long mobile, String email){
		
		System.out.println(name + " Employee joined");
		
		this.name = name; //this = new Employee()
		this.mobile = mobile;
		this.email = email;
		this.id = idGenerate++;
		
		//System.out.println(idGenerate);
		
		
	}
	
	void id() {
		
		this.welcome();
		System.out.println("\n********Employee ID********\n");
		System.out.println("Name: " + this.name);
		System.out.println("ID: " + id);
		System.out.println("Mobile: " + mobile);
		System.out.println("E-Mail: " + email);
	}
	
	void welcome(){
		System.out.println("Welcome " + this.name);
	}
	
	//Class or static method
	static void empDetails(Employee emp_1, Employee emp_2) {
		
		System.out.println("********Employee 1********");
		
		//emp_1.id();
		System.out.println("Name: " + emp_1.name);
		System.out.println("ID: " + emp_1.id);
		System.out.println("Mobile: " + emp_1.mobile);
		System.out.println("E-Mail: " + emp_1.email);
		
		System.out.println("********Employee 2********");
		//emp_2.id();
		
		System.out.println("Name: " + emp_2.name);
		System.out.println("ID: " + emp_2.id);
		System.out.println("Mobile: " + emp_2.mobile);
		System.out.println("E-Mail: " + emp_2.email);
	}
}
