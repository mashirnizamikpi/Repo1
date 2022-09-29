package Test;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		try (Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);) {
		System.out.println("Enter the two values:");
			//int a=sc1.nextInt();
			//System.out.println("Enter the value of b:");
			//int b=sc2.nextInt();

			int div = sc1.nextInt()/sc2.nextInt();

			System.out.println("Result After division:"+div);

		} catch (Exception e) {
			System.out.println("Arithmetic exception");
		} finally {
			System.out.println("Running");
		}
	}

}
