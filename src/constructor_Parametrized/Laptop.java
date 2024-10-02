package constructor_Parametrized;

public class Laptop {
	int price;
	double weight;
	String brand;
	Laptop(){
		System.out.println("This is no-arg constuctor");
	}
	Laptop(int price,double weight,String brand){
		this.price=price;
		this.weight=weight;
		this.brand=brand;
	}
	public void getDetails() {
		System.out.println("price of laptop is:"+price);
		System.out.println("weight of laptop is:"+weight);
		System.out.println("brand of laptop is:"+brand);
		System.out.println("=============================");
	}

}
