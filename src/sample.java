
public class sample {

	public static void main(String[] args) {
		
		House obj1 = new House();
	
	
		
		obj1.livingRoom();
		House.kitchen();
	}
	
	

}


	
	class House
	{
		void livingRoom()
		{
			System.out.println("Living room is built");
		}
		
		static void kitchen()
		{
			System.out.println("Kitchen is built");
		}
	}
	
	

