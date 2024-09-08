package inheritence_superKeyword;

public class Vehicle {
	String name;
	double price;
	String color;
	
	Vehicle(){
		System.out.println("default callgggggggggggggggggg");
	}
	
	
	Vehicle(String name,double price,String color){
		this.color=color;
		this.name=name;
		this.price=price;
		System.out.println(name);
		System.out.println(price);
		System.out.println(color);
		
	}
	

}
