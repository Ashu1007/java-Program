package non_static_inner_class;

public class Outer {
	int x=34;
	public void test() {
		System.out.println("test method of class");
	}
	
	class Inner
	{
		int y=34;
		public void demo() {
		   System.out.println("demo method of inner class");
		}
	}

}
