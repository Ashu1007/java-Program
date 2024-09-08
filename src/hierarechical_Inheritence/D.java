package hierarechical_Inheritence;

public class D extends C {
	int x=120;
	int s=100;
	
	public void test() {
		int x=200;
		int t=210;
		
		System.out.println("Local t is: "+t);
		System.out.println("s of D is: "+s);
		System.out.println("r of C is: "+r);
		System.out.println("q of B is: "+q);
		System.out.println("p of A is : "+p);
		System.out.println("================");
		System.out.println("Local x is: "+x);
		System.out.println("Global x is: "+this.x);
		System.out.println("Global x is: "+super.x);
		System.out.println("Global x is: "+getXOfB());
		System.out.println("Global x is: "+getXOfA());
	}

}
