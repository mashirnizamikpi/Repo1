package Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author MashirNizami
 *
 */
public class TestCollection {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Comparable> list2 = new ArrayList<Comparable>();

		list.add("x");
		list.add("y");
		list.add("z");

	//	list2.add(1);
	//	list2.add("x");
		// list2.add("x","y") is not possible because it pass only parameter
		// System.out.println(list.get(2));

		// System.out.println(list2);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == "z") {
				System.out.println(i);
			}
			}
		{		for (int j = 0; j < 10; j++) {
				
				list2.add(j);
				//System.out.println(list2);
				

			}
			System.out.println(list2);
		}
		//System.out.println(list2);
	}
}