package chap04.lecture.flowcontrolstatement;

import java.util.Scanner;

public class D_switch {
	
	public void testSimpleSwitchStatement() {
		
		/* [switch문 표현식]
		 * switch(비교할변수) {
		 *     case 비교값1 : 비교값1과 일치하는 경우 실행할 구문; break;
		 *     case 비교값2 : 비교값2와 일치하는 경우 실행할 구문; break;
		 *     default : 모든 case에 해당하지 않는 경우 실행할 구문; break;
		 * }
		 * 
		 * 비교 가능한 타입 : 정수, 숫자, 문자, 문자열
		 * 비교 불가능한 타입 : 실수, 논리
		 * 
		 * if-else-if와 호환 가능하지만 일치 여부를 판단하는 문장만 호환 가능
		 * switch문은 대소 비교를 할 수 없다.
		 * 
		 * 또한 문자열 비교는 jdk 1.7 이상부터만 비교 가능하다.
		 * */
		
		/* 정수 두 개와 연산기호 문자를 입력 받아서
		 * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산기호 입력(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
			case '+' : 
				result = first + second;
				break;
			case '-' : 
				result = first - second;
				break;
			case '*' : 
				result = first * second;
				break;
			case '/' :
				result = first / second;
				break;
			case '%' : 
				result = first % second;
				break;
			/* defualt문은 생략 가능하지만 생략하는 경우 이 위치에 주석으로 생략 이유를 달아주는 것이 좋다. */
		}
		
		System.out.println(first + " " + op + " " + second + " = " + result);
	}

}

