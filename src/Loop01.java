import java.util.Scanner;

public class Loop01 {


	public static void main (String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			LDemo1 test = new LDemo1();
			
			test.display1(scan.nextInt());
			
			scan.close();
			

		}

	}

////for (initialization; condition; increment)  
///{  
   /// code to be executed  
///}  

class LDemo1{
	
	
	
	void display1(int n) {
		
		//local variable
		int i;
		for(i=2;i<=5;i++) { // 1 3 5 7 9 ...
			//if(i%2 != 0)
				System.out.println(i + " Java");
				
			
	
		}
	
	}
}
	
	
	//Instance Variable
	//	int a;





