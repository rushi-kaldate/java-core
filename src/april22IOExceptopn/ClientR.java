package april22IOExceptopn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ClientR {
	public static void main(String[] args) {
		
//		File f = new File("source.txt");
//		FileInputStream fis = null;
//		
//		try {
//			fis = new FileInputStream(f);
//			int ch;
//			while((ch = fis.read()) != -1)
//				System.out.print((char)ch);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		File f = new File("source.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			int ch;
			while((ch = fis.read()) != -1)
				System.out.print((char)ch);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
