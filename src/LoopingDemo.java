package classPrograms;

import java.util.Scanner;

public class LoopingDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LDemo obj = new LDemo();
		
		obj.display(scan.nextInt());
		
		scan.close();
		
	}

}

class LDemo{
	
	//Instance Variable
	int a;
	
	void display(int n) {
		
		//local variable
		int i; //in
		for(i=2;i<=n;i++) { // 1 3 5 7 9 ... 
			//if(i%2 != 0)
				System.out.println(i + " Java");
		}
		
		for(i=10; i>=1; i--) // 10 9 8 7 ....1 0
			System.out.println(i + " Selinum");
		
		//for(;;)
			//System.out.println("Infinite");
		
		for(i=1; i<=n; i++) // 1 2 3 4 5 6....n
			System.out.println(i + " * 9 =" + i*9);
		
	}
}

/*
 * 
 * LOOPING
 * - Initialization
 * - Condition
 * - Inc / Dec 
 * 
 * 1 * 9 = 9
 * 2 * 9 = 18
 * 3 * 9 = 27
 * 
 * 
 * 
 */
