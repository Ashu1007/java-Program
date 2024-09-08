package object_loading_process;

public class Fruit {
	{
		System.out.println("Fruit non-static block");
	}
	Fruit(){
		System.out.println("Fruit no arg constructor");
	}
	static {
		System.out.println("Fruit static block");
	}

}
