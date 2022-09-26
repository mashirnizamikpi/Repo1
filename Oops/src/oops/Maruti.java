package oops;
//child Maruti inherits Parent Brand
public class Maruti extends brand{

	
			
	@Override
	int speed() {
		return 100;
	}
	   {
		System.out.println("Maruti Model: 800");
	   }
	 
	   public static void main(String args[])
	   {
		 Maruti mar=new Maruti();
		 mar.Category();
		 mar.Product();
		 mar.speed();
		 	   }
	}