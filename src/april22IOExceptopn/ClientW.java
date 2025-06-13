package april22IOExceptopn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
 * Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
 * when an unknown printer took a galley of type and scrambled it to make a type specimen book.
 * It has survived not only five centuries, but also the leap into electronic typesetting,
 * remaining essentially unchanged.
 * */
public class ClientW {
//	public static void main(String[] args) {
//		
//		String filename = "source.txt";
//		FileOutputStream fos = null;
//		
//		try {
//			char ch  = 'H';
//			fos = new FileOutputStream(filename);
//			fos.write(ch);
//			System.out.println("TRY");
//		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("CATCH");
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("CATCH");
//		}
//		finally{
//			if(fos != null)
//			try {
//				fos.close();
//			}
//			catch(IOException e) {
//				e.printStackTrace();
//				System.out.println("FINALLY");
//			}
//			System.out.println("BYE BYE");
//		}
//	}
	
	public static void main(String[] args) {
		
		String filename = "source.txt";
		FileOutputStream fos = null;
		
		String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \r\n"
				+ " * Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\r\n"
				+ " * when an unknown printer took a galley of type and scrambled it to make a type specimen book.\r\n"
				+ " * It has survived not only five centuries, but also the leap into electronic typesetting,\r\n"
				+ " * remaining essentially unchanged";
		
		try {
			
			fos = new FileOutputStream(filename);
			//char ch = 'R';
			//fos.write(ch);
			for(int i=0;i<s.length();++i)
			fos.write(s.charAt(i));
			System.out.println("try");
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
			if(fos != null)
				try {
					fos.close();
				}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("finally");
		
		}
	}
	

}
