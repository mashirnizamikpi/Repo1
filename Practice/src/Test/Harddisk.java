package Test;

public class Harddisk implements Computer,Laptop{
	
	
	    Harddisk(){
	    	
	    }

	@Override
	public void key() {
		// TODO Auto-generated method stub
		System.out.println("Key board");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Size based");
	}
	
	
	public static void main(String args[]) {
        
		Harddisk h =new Harddisk();
		h.key();
		h.size();
		
	}


}
