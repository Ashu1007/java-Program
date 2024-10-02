package constructor_Parametrized;

public class Fruit {
	String name;
	int price;
	double weight;
	Fruit(){
		System.out.println("This is no-Arg constuctor");
		System.out.println("=============================");
	}
	
	Fruit(String name,int price,double weight){
		this.name=name;
		this.price=price;
		this.weight=weight;
	}
	public void getDetails() {
		System.out.println("Name is: "+name);
		System.out.println("Price is:"+price);
		System.out.println("Weight is:"+weight);
		System.out.println("============================");
	}

}
