package initialization_Of_Object_by_non_static_method_initiali;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1=new Employ();
		Employ e2=new Employ();
		
		e1.setValue("Mohan",342,4334.23);
		e2.setValue("Sohan", 230, 463546.64);
		e1.getDetails();
		e2.getDetails();
	}

}
