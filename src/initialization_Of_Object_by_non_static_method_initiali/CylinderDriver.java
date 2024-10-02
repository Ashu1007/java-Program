package initialization_Of_Object_by_non_static_method_initiali;

import java.util.Scanner;

public class CylinderDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cylinder c1=new Cylinder();
		Cylinder c2=new Cylinder();
		System.out.println("Enter the value1: ");
		double r1=sc.nextDouble();
		System.out.println("Enter the value1: ");
		double h1=sc.nextDouble();
		System.out.println("Enter the vlaue2: ");
		double r2=sc.nextDouble();
		System.out.println("Enter the value2: ");
		double h2=sc.nextDouble();
		
		c1.setValue(r1, h1);
		c2.setValue(r2, h2);
		
		c1.getArea();
		c1.getVolume();
		c1.getCSA();
		System.out.println("==================");
		
		c2.getArea();
		c2.getVolume();
		c2.getCSA();
		System.out.println("==================");
		
		sc.close();
	}

}
