package return_statement;

public class Program1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Main Method");
		if(10<8)
		{
			System.out.println("Inside if block");
			
			return;
		
		}
		
		System.out.println("Outside the block");
		
	}
	
}
