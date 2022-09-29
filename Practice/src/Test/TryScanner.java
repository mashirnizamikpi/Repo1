package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryScanner {
	/**
	 * @param args
	 */
	public static void main(String args[]) {

		try (Scanner sc = new Scanner(new File("src/Test/bcd.txt"))) {
			while (sc.hasNext()) {
				int i = sc.nextInt();
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	//	finally {
		//if (sc != null) {
		// sc.close();

		// }

	}

}
