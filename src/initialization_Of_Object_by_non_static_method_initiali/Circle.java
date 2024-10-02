package initialization_Of_Object_by_non_static_method_initiali;

public class Circle {
	double radius;
	public void setValue(double radius) {
		this.radius=radius;
	}
	public void getArea() {
		double area=Math.PI*radius*radius;
		System.out.println("Area of Cirle is: "+area);
	}
	public void getCircumference() {
		double c=2*(Math.PI*radius);
		System.out.println("Circumference of Circle is: "+c);
	}
	
}
