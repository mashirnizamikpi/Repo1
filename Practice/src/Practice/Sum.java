package Practice;

public interface Sum {
	
	//abstract method
	public void addition(int b,int c);
	
	default void show()
	{
		System.out.println("Default Method");//default method
	}
	
class Add implements Sum
{
	public void addition(int b,int c) {
		
		System.out.println(b+c);
		
	}
	
	public static void main (String args[])
	{
		Add a = new Add();
		a.addition(1, 9);
		
		a.show();
	}	
}
	

}
