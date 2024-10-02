package initialization_Of_Object_by_non_static_method_initiali;

import java.util.Scanner;

public class TriangleDriver {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Triangle t1=new Triangle();
		Triangle t2=new Triangle();
		
		System.out.println("ENter the value a1: ");
		double a1=sc.nextDouble();
		System.out.println("ENter the value b1: ");
		double b1=sc.nextDouble();
		System.out.println("Enter the value c1: ");
		double c1=sc.nextDouble();
		
		t1.setValue(a1, b1, c1);
		t2.setValue(2, 3, 4);
		
		t1.getArea();
		t1.getParimeter();
		System.out.println("========================");
		t2.getArea();
		t2.getParimeter();
		
		sc.close();
	}

}
