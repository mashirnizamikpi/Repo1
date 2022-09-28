package Practice;

public interface Sum {
	
	//abstract method
	public void addition(int a);
	
	default void show(int b,int c)
	{
		int r=b+c;
		System.out.println("Addtion performed successfully");//default method
	}
	
class Add implements Sum
{
	public void addition(int a) {
		
				
	}
	
	public static void main (String args[])
	{
		Add a = new Add();
		a.addition(1);
		
		a.show(9,11);
	}	
}
	

}
