package chap04.lecture.flowcontrolstatement;

import java.util.Scanner;

public class B_ifElse {
	
	public void testSimpleIfElseStatement() {
		
		/* [if-else문 표현식]
		 * if(조건식) {
		 *     조건이 true일 때 실행할 명령문;
		 * } else {
		 *     조건이 false일 때 실행할 명령문;
		 * }
		 * */
		
		/* 정수 한 개를 입력 받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."라고 출력하고
		 * 홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 작성해보자
		 * 단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다."라고 출력되도록 한다.
		 * */
		
		/* 1. 입력값이 무엇이고 출력값이 무엇인지 생각 (사용하는 변수가 무엇인지 결정)
		 * 2. 조건이 무엇인지 판단한다. (해야 하는 task 세분화)
		 * 3. 어떤 구문을 사용할 것인지 결정 (어떻게 각각의 task를 해결할 것인지)
		 * 4. 조건을 판단할 순서를 정한다. (task 나열)
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 1) {
			System.out.println("입력하신 정수는 홀수입니다.");
		} else {
			System.out.println("입력하신 정수는 짝수입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void testNestedIfElseStatement() {
		
		/* 숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고,
		 * 음수이면 "입력하신 숫자는 음수입니다."출력
		 * 단, 0이면 "0입니다"라고 출력하세요
		 * 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다."라고 출력되도록 한다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0입니다.");
		} else {
			if(num > 0) {
				System.out.println("입력하신 숫자는 양수입니다.");
			} else {
				System.out.println("입력하신 숫자는 음수입니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}

