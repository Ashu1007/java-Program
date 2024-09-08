package single_level_superCall;

public class Vehicle {
	int name;
	Vehicle(){
		super();
		System.out.println("Vehicle no arg constructor");
	}
	Vehicle(int x){
		super();
		System.out.println("Vehicle int arg constructor");
		
	}
	
}
