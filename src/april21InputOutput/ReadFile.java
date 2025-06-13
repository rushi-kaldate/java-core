package april21InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		File f = new File("ProductList.txt");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(f);
			byte []x = fis.readAllBytes();
			String s = new String(x);
			System.out.println(s);
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
				fis.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("FINALLY");
		}
        
	}

}
