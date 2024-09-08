package static_keyword;

public class Driver {
	public static void main(String[] args) {
		System.out.println(Outer.x);
		Outer.test();
		
		System.out.println("====================");
		
		System.out.println(Outer.inner.y);
		Outer.inner.demo();
	}

}
