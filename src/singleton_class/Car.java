package singleton_class;

public class Car {
	
	private static Car c = null;
	
	private Car() {
		
	}
	public static Car getInstance() {
		if(c==null) {
			c=new Car();
			return c;
		}
		return c;
	}

}
