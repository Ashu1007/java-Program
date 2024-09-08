package single_level_superCall;

public class Car extends Vehicle {
	int hp;
	Car(){
		super();
		System.out.println("Car no arg constructor");
	}
	Car(int x){
		super(34);
		System.out.println("Car int arg constructor");
	}

}
