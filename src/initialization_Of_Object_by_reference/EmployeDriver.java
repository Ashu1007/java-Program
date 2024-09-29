package initialization_Of_Object_by_reference;

public class EmployeDriver {
	public static void main(String[] args) {
		Employ e1=new Employ();
		Employ e2=new Employ();
		Employ e3=new Employ();
		
		e1.name="Mohan";
		e1.id=123;
		e1.salary=23233.3;
		e2.name="Sohan";
		e3.name="Man-Mohan";
		
		System.out.println("======Employ1Details========");
		System.out.println(e1);
		System.out.println(e1.name);
		System.out.println(e1.id);
		System.out.println(e1.salary);
		System.out.println(e2);
		System.out.println(e3);
	}

}
