package Revision;

public class Student extends Principal {

	void draw() { // Method
		System.out.println("Drawing is best");
	}


	// Main Method of a program
	public static void main(String args[]) {

		Principal p = new Principal();// creating object of parent class

		Student s = new Student();// creating object of class
		p.size();
		p.teachers();
		s.draw();
		
	

		// Creating object of constructor of parent class

		Principal a1 = new Principal();
		// Creating object of constructor of parent class with parameters
		Principal a2 = new Principal(0, 0);
		// Creating object of constructor of parent class with parameters
		Principal a3 = new Principal("test", "test");

	}

}
