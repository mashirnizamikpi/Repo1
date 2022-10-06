package com;

/**
 */

interface MathOperation{
	int operation(int a,int b);
}



public class LambdaPractice {
private int operate(int a,int b,MathOperation mathOperation) {
	return mathOperation.operation(a,b);
	
}
	
	
	public static void main(String[] args) {
		
		LambdaPractice tester = new LambdaPractice();
		MathOperation addition = (int a,int b) -> a+b;
		
		MathOperation substraction = (a,b) -> a-b;
		
		MathOperation multiplication = (a,b) -> {return a*b;};
		
		MathOperation division = (a,b) -> a/b;
		
	System.out.println(tester.operate(10,5,addition));
	System.out.println(tester.operate(10,5,substraction));
	System.out.println(tester.operate(10,5,multiplication));
	System.out.println(tester.operate(10,5,division));
	
	
	}

}



