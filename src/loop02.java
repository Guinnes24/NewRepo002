import java.util.Scanner;

public class loop02 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);

int row, column;
System.out.println("Enter the row: ");
row = scan.nextInt();
column = scan.nextInt();
NestedDemo obj_1 = new NestedDemo();

//obj_1.rectangle(row, column);

//obj_1.square(column);

obj_1.rangle(row);
scan.close();

	}

}

class NestedDemo{
void rectangle(int breadth, int length) {
	
	for(int r=1; r<=breadth; r++) { // 1 2 3
		
		for(int c=1; c<=length; c++) // 1 2 3 4
			System.out.print("*" + " ");
		
		System.out.println();
	}
	
}

void square (int sideleft) {
	
	int rr = 2;
	
	for (int i=1; i<=sideleft; i++) {
		
		for (int t=1; t<=i; t++) { 
			
			System.out.print(rr++ + " ");
			//System.out.println(" * " + "  ");
			
		}
		
		System.out.println();
	}

		
	}

void rangle (int hight) {
	
	int space = hight-1;
	
	for (int i = 1 ; i<=hight; i++) {
		
		
		for (int s=1; s<=hight ; s++)
			System.out.println(" ");
		
		space--;
		
		for (int j=1; j<=i; j++);
		
		System.out.print(" * ");
			
System.out.println();
	}
	
	
	
}


}