package chap04.question;

import java.util.Scanner;

public class Application5 {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in); //객체를 새로 만들어주지 않으면 오류난다.
			
		System.out.print("정수를 하나 입력하세요: ");
		int i1 = sc1.nextInt();
		
		System.out.print("정수를 하나 입력하세요: ");
		int i2 = sc1.nextInt();
		
		System.out.print("연산기호(+, -, *, /, %) 중 하나를 입력하세요: ");
		char cal = sc2.nextLine().charAt(0);
		int calVal = (int)cal;
	
		
//		연산기호 해당 코드 +43, -45, *42, /47, %37
		if((calVal == 43) || (calVal == 45)||(calVal == 42)||(calVal == 47)||(calVal == 37)) {
			System.out.println("연산기호를 제대로 입력하였습니다. 연산 결과는 아래와 같습니다.");
			if(calVal == 43) {
				System.out.println(i1+i2);			
			}else if(calVal == 45) {
				System.out.println(i1-i2);
			}else if(calVal == 42) {
				System.out.println(i1*i2);				
			}else if(calVal == 47) {
				System.out.println(i1/i2);				
			}else {
				System.out.println(i1%i2);				
			}
			
		}else {
			System.out.print("연산기호를 제대로 입력하세요.");
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
