package non_static_inner_class;

public class Driver {
	public static void main(String[] args) {
		Outer o=new Outer();
		System.out.println(o.x);
		o.test();
		System.out.println("====================");
		Outer.Inner i=o.new Inner();
		System.out.println(i.y);
		i.demo();
		
	}
}
