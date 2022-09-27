package OOPS;

public class Employee extends Employer {

	public static void main(String a[]) {
		Employer emp=new Employer();
		//emp.getName;//private members cannot be accessed
		emp.getSalary();//public:anyone everywhere can access it
		emp.getEmpID();//protected:within the same package :OOPS
		//emp.getName();
	}
}
