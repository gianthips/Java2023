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
		} finally {
			if(fin!=null) {
				try{
					/*자원(resource)를 반납 혹은 해지라고 한다.*/
//					장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak)가 발생할 가능성이 있다,
//					뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야 한다.
//					만약 잔류 데이터가 남은 상태에서 추가로 스트림을 사용하면 데드락(deadlock)상태가 된다.
					fin.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
