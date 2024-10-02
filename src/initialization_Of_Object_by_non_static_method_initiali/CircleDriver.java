package initialization_Of_Object_by_non_static_method_initiali;

import java.util.Scanner;

public class CircleDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c1=new Circle();
		Circle c2=new Circle();
		Circle c3=new Circle();
		System.out.println("Enter the value: ");
		double a=sc.nextDouble();
		
		c1.setValue(a);
		c2.setValue(5);
		c3.setValue(2);
		
		c1.getArea();
		c1.getCircumference();
		System.out.println("============================");
		c2.getArea();
		c2.getCircumference();
		System.out.println("==============================");
		c3.getArea();
		c3.getCircumference();
		System.out.println("============================");
		
		sc.close();
	}

}
