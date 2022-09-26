package oops;

public class Car extends Transport{


	@Override
	int speed() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	String modelnumber() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	char regno() {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	int Height() {
		return 255;
		// TODO Auto-generated method stub
		
	}
	@Override
	char Company() {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	char type() {
		return 123;
		// TODO Auto-generated method stub
		
	}


	   public Car()
	   {
		System.out.println("Class Car");
	   }
	   public void Category()
	   {
		System.out.println("Category : brand");
	   }
	}
