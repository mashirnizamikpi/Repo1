package com;

import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface TestForEach {
	
	 void print(List test);
}

public class ForEach {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Bananana");
		fruitList.add("Pineapple");
		fruitList.add("Stawberry");
		fruitList.add("Cherry");
		
		
		fruitList.forEach(fruit -> System.out.println(fruit));
	
		TestForEach tfe=fruit -> System.out.println(fruit);
	}

}
