package chap04.question;

import java.util.Scanner;

public class Application5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
//		System.out.print("정수를 하나 입력하세요");
//		int i1 = sc.nextInt();
//		
//		System.out.print("정수를 하나 입력하세요");
//		int i2 = sc.nextInt();
		
		System.out.print("연산기호(+43, -45, *42, /47, %37) 중 하나를 입력하세요");
		String cal = sc.nextLine();
		int caltest = Integer.valueOf(cal);
		
		if((caltest == 43) || (caltest == 45)||(caltest == 42)||(caltest == 47)||(caltest == 37)) {
			System.out.print("연산기호를 제대로 입력하였습니다.");			
		}else {
			System.out.print("연산기호를 제대로 입력하세요");
		}
		
//		String c = sc.nextLine();
		
		
		
		
		
		/* 두 개의 정수를 입력 받아 변수에 저장하고,
		 * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
		 * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
		 * 
		 * -- 입력 예시 --
		 * 첫 번째 정수 : 4
		 * 두 번쨰 정수 : 3
		 * 연산 기호를 입력하세요 : +
		 * 
		 * -- 출력 예시 --
		 * 4 + 3 = 7 
		 */
		
	}
	
}
