package com;


interface stable {
	boolean mental(boolean st);
	
	
}


public class Asylum {

	private boolean operate(boolean s, stable st) {
		return st.mental(s);
	}	
	
	public static void main(String[] args) {

		Asylum test = new Asylum();
	
		stable p1 = (boolean s) -> s;
		stable p2 = (boolean s) -> s;
		stable p3 = (boolean s) -> s;
		stable p4 = (boolean s) -> s;
		stable p5 = (boolean s) -> s;
		stable p6 = (boolean s) -> s;
		stable p7 = (boolean s) -> s;
		stable p8 = (boolean s) -> s;
		
			
		System.out.println();
		System.out.println("The two people who recovered after 8 months and will get released are - ");
		
		if(test.operate(false,p1)==true) {
			System.out.println("Person 1");
			
		}
		if(test.operate(true,p2)==true) {
			System.out.println("Person 2");
			
		}
		if(test.operate(false,p3)==true) {
			System.out.println("Person 3");
			
		}
		if(test.operate(true,p4)==true) {
			System.out.println("Person 4");
			
		}
		if(test.operate(false,p5)==true) {
			System.out.println("Person 5");
			
		}
		if(test.operate(false,p6)==true) {
			System.out.println("Person 6");
			
		}
		if(test.operate(false,p7)==true) {
			System.out.println("Person 7");
			
		}
		if(test.operate(false,p8)==true) {
			System.out.println("Person 8");
			
		}
		
	
	
	}
}