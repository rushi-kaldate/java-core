package april21InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClientW {
	public static void main(String[] args) {
		File f = new File("Exam.txt");
		String s = "Good Morning OF all student.....";

		byte b[] = s.getBytes();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(b);
			System.out.println("TRY");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		} 
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		finally {
			try {
				fos.close();
				System.out.println("FINALLY");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}


	}

}
