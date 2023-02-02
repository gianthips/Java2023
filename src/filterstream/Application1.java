package filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {
	public static void main(String[] args) {
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/filterstream/testBuffered.txt"));
		
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
		
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try{
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("src/filterstream/testBuffered.txt"));
			
			String temp;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
