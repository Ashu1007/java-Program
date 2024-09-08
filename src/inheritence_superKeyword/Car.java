package inheritence_superKeyword;

public class Car extends Vehicle {
	int hp;
	int strokes;
	Car(){
		System.out.println("car default constructor");
	}
	
	
	Car(String name,double price,String color,int hp,int strokes){
//		super()
		super(name,price,color);
//		this()
//		super.name=name;
//		super.price=price;
//		super.color=color;
		this.hp=hp;
		this.strokes=strokes;
		System.out.println(name);
		System.out.println(price);
		System.out.println(color);
		System.out.println(hp);
		System.out.println(strokes);
	}

}
