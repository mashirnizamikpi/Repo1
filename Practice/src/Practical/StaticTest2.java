package Practical;

public class StaticTest2 {
	
	static int a=10;
	static int b;
	
	static {
		System.out.println("Static block");
	b=10;
	b=a*4;
	}
	
	public static void main(String[] args) {
	
	System.out.println(b);
	System.out.println(a);
	

}
}
