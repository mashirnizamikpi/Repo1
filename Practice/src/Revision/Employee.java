package Revision;

public class Employee implements Leaves,Salary{


	@Override
	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("Salary Amount :1000");
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
	
		
	}

	@Override
	public void reason() {
		// TODO Auto-generated method stub
		System.out.println("Sick leave");
	}

	
	public static void main(String args[]) {
		
	Employee emp= new Employee();//Create an object
	emp.amount();//calling one method of the class by using syntax

		
	}
}
