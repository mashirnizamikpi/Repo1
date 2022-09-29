package Test;

import java.io.FileOutputStream;

public class TryWithResources {
	public static void main(String args[]) {
		
		try(FileOutputStream fileOutputStream = new FileOutputStream("src/Test/bcd.txt")){
			
		String msg = "hye that's Mashir Nizami";
		byte byteArray[]=msg.getBytes();
		fileOutputStream.write(byteArray);
		System.out.println("mesaage written");
		
		}
		catch (Exception exception) {
			System.out.println(exception);
			
		}
		finally {
			System.out.println("I am here");
				
			
		}
		}

}
