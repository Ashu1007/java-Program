package initialization_Of_Object_by_non_static_method_initiali;

import java.util.Scanner;

public class CuboidDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cuboid c1=new Cuboid();
		Cuboid c2=new Cuboid();
		
		System.out.println("ENter the value l1: ");
		double l1=sc.nextDouble();
		System.out.println("ENter the value w1: ");
		double w1=sc.nextDouble();
		System.out.println("ENter the value h1: ");
		double h1=sc.nextDouble();
		
		c1.setValue(l1, w1, h1);
		c2.setValue(2, 3, 4);
		
		c1.getArea();
		c1.getVolume();
		c1.getCSA();
		System.out.println("==========================");
		c2.getArea();
		c2.getVolume();
		c2.getCSA();
		
		sc.close();
	}

}
