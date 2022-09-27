package Practice;

class ExceptionCheck {
	public static void main(String[] args) {
		int a = 5, b = 0;// b=1

		// place of ambiguity
		try {
			System.out.println(a / b);
		}
		
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("I will be there even if no one is there");
		}
	}
}