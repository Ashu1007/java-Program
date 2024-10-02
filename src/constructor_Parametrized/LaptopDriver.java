package constructor_Parametrized;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		Laptop l2=new Laptop(50000, 5, "HP");
		
		l1.getDetails();
		l2.getDetails();
	}

}
