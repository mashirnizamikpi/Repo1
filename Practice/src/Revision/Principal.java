package Revision;

public class Principal implements Class,School {

	//Default Constructor
	Principal() {
		// TODO Auto-generated constructor stub
	}
	//Default Constructor with parameters
	Principal(int a,int b) {
		// TODO Auto-generated constructor stub
		
		System.out.println("Best Principal");
	}
	
	//Default Constructor with parameters
	Principal(String a,String b){
		
		System.out.println("Best School");
		
	}
	
	

	@Override
	public void teachers() {
		// TODO Auto-generated method stub
		System.out.println("Teaching is best");
		
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("The range of class");
		
	}

	@Override
	public void students() {
		// TODO Auto-generated method stub
		System.out.println("The number of students");
		
	}
	
	

}
