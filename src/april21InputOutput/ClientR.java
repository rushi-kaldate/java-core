package april21InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClientR {
	public static void main(String[] args) {
		File f = new File("Exam.txt");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(f);
			byte []x = fis.readAllBytes();
			String res = new String(x);
			System.out.println(res);
			System.out.println("TRY");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		finally {
			try {
				fis.close();
				System.out.println("FINAALY");
			}

			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}
}
