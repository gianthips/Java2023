package chapinout;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("text.txt");
		
		try{
			boolean isCreated = file.createNewFile();
			System.out.println("isCreated : " + isCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일의 크기:" + file.length() + "byte");
		System.out.println("파일의 경로:" + file.getPath());
		System.out.println("파일의 상위 경로:" + file.getParent());
		System.out.println("파일의 절대 경로:" + file.getAbsolutePath());
		
		boolean isDeleted = file.delete(); // 패키지에 놓고 F5 누르면 파일 없어지는 걸 볼 수 있음.
		
		System.out.println("isDeleted : " + isDeleted);

	}

}
