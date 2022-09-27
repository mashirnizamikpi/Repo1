package Practice;

public class TestConstructor {
public TestConstructor() {
	int no0fLegs=2;
}
public TestConstructor(int no0fLegs,boolean fly) {
	if(no0fLegs>2)
		fly=true;
}
public static String TestConstructor() {
	return "";
}
public static void main (String[] args) {

	System.out.println("I am Bright");
}
}
