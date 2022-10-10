package Test;

public class Employee {

	Employee() {
		// TODO Auto-generated constructor stub
	System.out.println("Constructor1");
	}
	
	public Employee(int Salary,int year) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor2");
	}

	
	public Employee(String Salary,String year) {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor3");
	}
	
	public static void main(String a[] ) {
         Employee a1 = new Employee();
         Employee a2= new Employee(0,0);
         Employee a3 = new Employee("test","test");
         
	}

}
