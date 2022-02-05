

import java.util.Scanner;



public class nested {

	public static void main(String[] args) {
		Scanner Nscan01 = new Scanner(System.in);
		
		chknext chk = new chknext();
		

	//	int row, column ;
	//	System.out.println("enter the row");
	//row = Nscan01.nextInt();
	//System.out.println("enter the column");
			//column = Nscan01.nextInt();
		
		
			int side1lenth, side2breath ;
			System.out.println("enter the row");
			side1lenth = Nscan01.nextInt();
	//System.out.println("enter the column");
		side2breath = Nscan01.nextInt();
			
		chk.chk02(side1lenth, side2breath);
		
		//chk.demo (side1lenth, side2breath);
				Nscan01.close();
		}
	}



class chknext{
	
	void demo(int side1lenth, int side2breath) { 
		
		for(int r=1; r<=side1lenth; r++) 
			for(int c=1; c<=side2breath; c++) 
				System.out.print("side1lenth: " + r + " " + "side2breath: " + c + "\t");
			
		//System.out.println("name:" + y + " " + "name2: " + u " \t ");
			
			System.out.println();
			}
		
		
				
				void chk02 (int side1lenth , int side2breath) {
					
					for (int l=1; l<=side1lenth; l++) {
						for (int b=1; b<=side2breath; b++);
						System.out.print("*" + " ");
						
						System.out.println();
			
		}
	}
			

		
	
	
}
	
