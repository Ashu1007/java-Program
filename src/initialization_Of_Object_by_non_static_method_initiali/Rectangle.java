package initialization_Of_Object_by_non_static_method_initiali;

public class Rectangle {
	double lenth;
	double width;
	public void setValue(double lenth,double width) {
		this.lenth=lenth;
		this.width=width;
	}
	public void getArea() {
		double area=lenth*width;
		System.out.println("Area of Rectangle is: "+area);
	}
	public void getParimeter() {
		double parimeter=2*(lenth+width);
		System.out.println("Parimeter of Rectangle: "+parimeter);
	}

}
