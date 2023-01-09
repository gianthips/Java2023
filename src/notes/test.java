package notes;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	        
	        int A, B;
	        
	        while(sc.hasNextInt())    //sc.hasNextInt() 입력한 숫자가 정수면 true 아니면 false
	        {
	            A = sc.nextInt();
	            B = sc.nextInt();
	            
	            System.out.println(A+B);
	        }
	        
	        sc.close();
		
	}

}
