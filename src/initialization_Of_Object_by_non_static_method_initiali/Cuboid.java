package initialization_Of_Object_by_non_static_method_initiali;

public class Cuboid {
	double length;
	double width;
	double height;
	
	public void setValue(double length,double width,double height) {
		this.length=length;
		this.width=width;
		this.height=height;
	}
	public void getVolume() {
		double volume=length*width*height;
		System.out.println("Volume of Cuboid:"+volume);
	}
	public void getArea() {
		double area=2*(length*width+width*height+height*length);
		System.out.println("Area of Cuboid is:"+area);
	}
	public void getCSA() {
		double CSA=2*height*(length+width);
		System.out.println("CSA of Cuboid is:"+CSA);
	}

}
