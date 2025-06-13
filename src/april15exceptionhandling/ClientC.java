package april15exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClientC {
	public static void main(String[] args) {
		File f = new File("target.txt");
		FileOutputStream fos =  null;

		try {
			fos = new FileOutputStream(f);
			fos.write("Hello".getBytes());
			System.out.println("TRY");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		finally {
			try {
				fos.close();
			}
			catch(IOException e) {
				System.out.println("CATCH");
			}
			System.out.println("Finally");
		}
	}







	//	public static void main(String[] args) {
	//		File f = new File("target.txt");
	//		FileOutputStream fos = null;
	//
	//		try {
	//			fos = new FileOutputStream(f);
	//			fos.write("Hello".getBytes());
	//			System.out.println("TRY");
	//		}
	//		catch(FileNotFoundException e) {
	//			e.printStackTrace();
	//			System.out.println("CATCH");
	//		}
	//		catch(IOException e) {
	//			e.printStackTrace();
	//			System.out.println("CATCH");
	//		}
	//		finally {
	//			try {
	//				fos.close();
	//			}
	//			catch(IOException e) {
	//				e.printStackTrace();
	//			}
	//			System.out.println("BYE");
	//		}
	//
	//	}

}
