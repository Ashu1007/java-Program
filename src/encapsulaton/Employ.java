package encapsulaton;

import java.util.Scanner;

public class Employ {
	
	private int s_pin=2231;
	private String name;
	private int id;
	private double salary;
	
	public String getName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN: ");
		int u_pin=sc.nextInt();
		
		if(s_pin==u_pin) {
			System.out.println("Validation is successfull!");
			return name;
		}
		else {
			System.out.println("Invalid PIN!");
			return null;
		}
			
	}
	
	public int getId() {
		//validation
		return id;
	}
	public double getSalary() {
		//validation
		return salary;
	}
	public void setName(String name) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the PIN: ");
		int u_pin=sc.nextInt();
		
		if(s_pin==u_pin) {
			System.out.println("Validation is successfull Name is set!");
			this.name=name;
		}
		else {
			System.out.println("Invalid PIN! Name is not set!");
		}
	}
	public void setId(int id) {
		//validation
		this.id=id;
	}
	public void setSalary(double salary) {
		//validation
		this.salary=salary;
	}
	
}