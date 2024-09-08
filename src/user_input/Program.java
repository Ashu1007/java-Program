package user_input;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First no. : ");
		int a=sc.nextInt();
		System.out.print("Enter Second no. : ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+ sum );
		sc.close();
	}

}
