package constructor_Parametrized;

public class FruitDriver {
	public static void main(String[] args) {
		Fruit f1=new Fruit();
		Fruit f2=new Fruit("Mango", 120, 3.5);
		
		f1.getDetails();
		f2.getDetails();
		
	}

}
