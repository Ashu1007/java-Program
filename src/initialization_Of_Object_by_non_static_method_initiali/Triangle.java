package initialization_Of_Object_by_non_static_method_initiali;

public class Triangle {
	double a;
	double b;
	double c;
	public void setValue(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void getArea() {
		if(a+b>c && b+c>a && c+a>b){
				double s=(a+b+c)/2;
		        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		        System.out.println("Area of Triangle is:"+area);
		}
		else {
			System.out.println("not form a valid Triangle");
		}
	}
	public void getParimeter() {
		if(a+b>c && b+c>a && c+a>b) {
			double Parimeter=a+b+c;
			System.out.println("Parimeter of triangle is:"+Parimeter);
		}
	}

}
