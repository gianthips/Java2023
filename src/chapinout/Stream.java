package chapinout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* FileInputStream */
		FileInputStream fin = null;
		
		
		try{
			fin = new FileInputStream("src/chapinout/testInputStream.txt");
			
//			int value; // = fin.read();
//			while( (value = fin.read()) != -1) {
//				System.out.print((char) value);
//			}
			
//			System.out.println((char) value); //
			System.out.println("파일의 길이:" + new File("src/chapinout/testInputStream.txt").length());
			
			int fileSize = (int) new File("src/chapinout/testInputStream.txt").length();
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i = 0; i<bar.length; i++) {
				System.out.print((char)bar[i]);
			}
			

		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
