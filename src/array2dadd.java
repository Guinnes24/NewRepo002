

public class array2dadd {

	public static void main(String[] args) {
		
		/* M1 1 2 3   M2 1 2 3   M1 + M2 (1+1) (2+2) (3+3) = 2 4 6
		 * M1 1 2 3   M2 1 2 3   M1 + M2 (1+1) (2+2) (3+3) = 2 4 6
		 * M1 1 4 6   M2 1 4 6   M1 + M2 (1+1) (4+4) (6+6) = 2 8 12
		 * 
		 *
		 */
		

		
		int a [][]= {{1,2,3},{1,2,3},{1,4,6},{1,1,1} };
		int b [][]= {{1,2,3},{1,2,3},{1,4,6}};
		
		
		int c [][]= new int [3][3];
		
		for (int i=0 ; i<3; i++) {
			
			for (int t=0 ; t<3; t++) {
				
				c[i][t] = a[i][t] + b[i][t];
				
				System.out.print(c[i][t]+ " ");
		}
			
			System.out.println();
			
			
		}
		System.out.println("Length of : " + a.length );
		System.out.println("lent of : " + b.length);
		System.out.println("len of: " + c.length);
	}

}
