package oops;

public class Bike extends Transport{


	@Override
	int speed() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	String modelnumber() {
		// TODO Auto-generated method stub
		return "Kawasaki";
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

	public static void main(String a[]) {
		Transport trp = new Bike();
		trp.getName();

	}
	}
