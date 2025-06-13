package april21InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		
		File f = new File("ProductList.txt");
		String s = "Hii Good morning all of Student";
		
		byte b[] = s.getBytes();
		FileOutputStream fos = null;
		
		try {
			 fos = new FileOutputStream(f);
			 fos.write(b);
			 System.out.println("TRY");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("CATCH");
		}
		finally {
			try {
				fos.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("FINALLY");
		}
		
		
	}

}
