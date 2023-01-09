package chap06.lecture;
import java.util.Scanner;

public class classes {

	public void testWhileExample2() {
		int iwhile;
		int dummy = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요");
		iwhile = sc.nextInt();
		
		
		while(dummy<=iwhile) {
			sum += dummy;
			dummy ++;
		}	
		System.out.print(sum);
	}
	
	public void testWhileExample3() {
		int i;
		int dummy1=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 구구단 몇 단을 출력할까요?");
		i = sc.nextInt();				
		while(dummy1<=9){
			System.out.println(i+"X"+dummy1+"="+(i*dummy1));
			dummy1++;
		}
	}
	
	public void testWhileExample4() {
		int i;
		int dummy1=1;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" 구구단을 몇 단까지출력할까요?");
		i = sc.nextInt();				
		while(dummy1<=i){
			
			int dummy2=1;
			
			while(dummy2<=9) {
				
				System.out.println(dummy1+"X"+dummy2+"="+(dummy1*dummy2));
				dummy2++; 
			}
			
			dummy1++;
			
		}
	}
	
	
}
