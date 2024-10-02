package initialization_Of_Object_by_non_static_method_initiali;

public class Cylinder {
	double radius;
	double height;
	public void setValue(double radius,double height) {
		this.height=height;
		this.radius=radius;
	}
	public void getArea() {
		double area=2*Math.PI*radius*(radius+height);
		System.out.println("Area of Cylinder is: "+area);
	}
	public void getCSA() {
		double CSA=2*Math.PI*radius*height;
		System.out.println("CSA of Cylinder is: "+CSA);
	}
	public void getVolume() {
		double volume=Math.PI*radius*radius*height;
		System.out.println("Volume of Cylinder is: "+volume);
	}

}
