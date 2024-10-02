package initialization_Of_Object_by_non_static_method_initiali;

import java.util.Scanner;

public class RectangleDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.println("Enter the value: ");
		double l1=sc.nextDouble();
		System.out.println("Enter the vlaue: ");
		double w1=sc.nextDouble();
		
		r1.setValue(l1, w1);
		r2.setValue(2, 3);
		
		r1.getArea();
		r1.getParimeter();
		System.out.println("====================");
		r2.getArea();
		r2.getParimeter();
		sc.close();
	}

}
