package InheritanceWithAbstractionDemo;

public class EmployeeDemo {

	public static void main(String[] args) {

		Manager m=new Manager();
		m.designationDetails();
		m.displayDetails();
		
		System.out.println("..........................");
		
		SalesExecutive s=new SalesExecutive();
		s.designationDetails();
		s.displayDetails();
		
		System.out.println("..........................");				
	}
}
