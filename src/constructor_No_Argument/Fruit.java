package constructor_No_Argument;

public class Fruit {
//	int x;
	static int object_count=0;
	Fruit(){
//		System.out.println("First object is created");
		object_count++;
		System.out.println("Fruit object "+object_count+" count is created");
	}
	
	

}
