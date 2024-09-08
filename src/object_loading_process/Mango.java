package object_loading_process;

public class Mango extends Fruit {
	static {
		System.out.println("Mango static block");
	}
	Mango(){
		System.out.println("Mango no arg constructor");
	}
	{
		System.out.println("Mango non- static block");
	}

}
