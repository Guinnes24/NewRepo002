
public class Inheritance01 {

	public static void main(String[] args) {
		
	//	Employee001 Ranjith = new Employee001("Ranjith", "chennai", "five", "SoftwareEngineer", "GreensTech", 9098765421l);
		//Ranjith.PrintEmployee();
		
		BankAccountNumber name = new BankAccountNumber("Ranjith", "chennai", "five", "SoftwareEngineer", "GreensTech", 90987654l, 8947889, 9021789, 8921089);
		
		
		name.PrintEmployee();
		name.PrintPF();
		name.Bank001(1236543890);
		name.PrintBankAccountNumber();
	
	}

}



class Employee001 {
	//class variable
	String Name, Address, WorkExperience, Positon , CompanyName;
	
	Long Mobile;
	
	Employee001 (){
		System.out.println("New Employee Joined");
	}
	
	Employee001 (String Name, String Address, String WorkExperience, String Positon, String CompanyName, long Mobile ) {
		this();
		this.Name = Name;
		this.Address = Address;
		this.WorkExperience = WorkExperience;
		this.Positon = Positon;
		this.CompanyName = CompanyName;
		this.Mobile = Mobile;
		
	}
	
	void PrintEmployee () {
		System.out.println("\n************ Employee Details ************\n" );
		System.out.println("Name: "+ this.Name);
		System.out.println("Address: "+ Address);
		System.out.println("WorkExperience: " + WorkExperience);
		System.out.println("Positon: " + Positon);
		System.out.println("CompanyName: "+ CompanyName);
		System.out.println("Mobile: "+ Mobile);
	}
		
	}

class PFAccNumber extends Employee001{
	
	
		String Name, Address, WorkExperience, Positon, CompanyName ;
		long Mobile, UANNumber, PanNo, AadharNumber;
	
	
	
	
	
//	PFAccNumber (long PanCard, long AadharCard,  long UANNumber){
//		
//		
//	}
	
	PFAccNumber (String Name, String Address, String WorkExperience, String Positon, 
			String CompanyName, long PanCard, long AadharCard, long Mobile, long UANNumber){
		super(Name,Address,WorkExperience, Positon, CompanyName, Mobile);
		
		
		this.UANNumber= UANNumber;
		this.PanNo = PanCard;
		this.AadharNumber = AadharCard;
		
	}
	
	void PFAccNumber01 (long UANNumber,long PanNo, long AadharNumber) {
		
		
		this.UANNumber= UANNumber;
		this.PanNo = PanNo;
		this.AadharNumber = AadharNumber;
		this.Name = super.Name;
		this.Address = super.Address;
		this.WorkExperience = super.WorkExperience;
		this.Positon = super.Positon;
		this.CompanyName = super.CompanyName;
		this.Mobile = super.Mobile;
			
	}
	
	void PrintPF() {
		System.out.println("\n*******UANNumber******\n");
		PrintEmployee();
		System.out.println("PanNo: "+ this.PanNo);
		System.out.println("AadharNumber" + this.AadharNumber);
		System.out.println("UANNumber: "+ this.UANNumber);
	}
}
	
	class BankAccountNumber extends PFAccNumber {
		
		static int token;
		long Accountnumber, UANNumber, PanNo, AadharNumber;
		
		
		static {
			token = 0;
		}
		
//	BankAccountNumber (){
//		super();
//			System.out.println("Bank is open");
//		System.out.println("token no: " + ++token);
//		}
		
		BankAccountNumber (String Name, String Address, String WorkExperience, String Positon, 
				String CompanyName,long Mobile, long PanCard, long AadharCard,  long UANNumber) {
			
			super( Name,  Address,  WorkExperience,  Positon, 
					 CompanyName, Mobile,  PanCard,  AadharCard,   UANNumber);
			
			System.out.println("Bank is open");
			System.out.println("token no: " + ++token);
			
		}
		
		
		void Bank001 (long Accountnumber) {
			///long UANNumber, long PanNo, long AadharNumber
			this.PanNo = super.PanNo;
			this.AadharNumber = super.AadharNumber;
			this.UANNumber = super.UANNumber;
			this.Accountnumber = Accountnumber;
		}
		
		void PrintBankAccountNumber() {
			
			System.out.println("\n*********BankAccountNumber*********\n");
			PrintPF();
			System.out.println("Accountnumber: " + this.Accountnumber);
		}
		
		
	}
