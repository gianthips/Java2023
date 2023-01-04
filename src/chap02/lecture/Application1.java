package chap02.lecture;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'a';
		char ch2 = 'A';
		/* 문자값 비교 */
		System.out.println("===문자값 비교===");
		System.out.println("ch1과 ch2가 같은지 비교:" + (ch1==ch2));
		System.out.println("ch1과 ch2가 큰 지 비교:" + (ch1>ch2));
		System.out.println("ch1과 ch2가 크거나 같은지 비교:" + (ch1>=ch2));
		System.out.println("ch1과 ch2가 작은지 비교:" + (ch1<ch2));
		System.out.println("ch1과 ch2가 작거나 같은지 비교:" + (ch1<=ch2));
		System.out.println("ch1과 ch2가 같지 않은지 비교:" + (ch1!=ch2));
		System.out.println("===논리값 비교===");
		
//		System.out.println("bool1과 bool2가 같지 않은지 비교:" + (bool1 != bool2));
////		System.out.println("bool1과 bool2가 큰지 비교:" + (bool1 > bool2));");불가함
//		System.out.println("===문자열 비교===");
//		System.out.println("str1과 str2가 같은지 비교:" + (str1 == str2)); // 문자열에 저장된 주소를 비교하는 것
//		System.out.println("str1과 str2가 같지 않은지 비교" + (str1 != str2)); // 
////		System.out.println("str1과 str2가 큰지 비교" + (str1 > str2)); 불가함
		/* 논리 연산자 */
//		1. 논리 연결 연산자: 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽에서 오른쪽이다. 두 개의 논리식을 판단하여 참과 거짓을 판단한다.
//		1-1. &&(논리 And 연산자): 두 개의 논리식 모두 참일 경우 참을 변환, 둘 중 한 개라도 거짓인 경우 거짓을 반환하는 연산자이다.
//		1-2. ||(논리 or 연산자): 두 개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환, 둘 다 모두 거짓일 경우 거짓을 반환한다.
//		2. 논리 부정 연산자: 피연산자가 하나인 단항연산자로, 피연산자의 결합 방향은 왼쪽에서 오른쪽이다.
//		2-1. !(논리 not 연산자)
		System.out.println("true와 true의 논리 and 연산 : " + (true && true));
		System.out.println("true와 false의 논리 and 연산 : " + (true && false));
		System.out.println("false와 true의 논리 and 연산 : " + (false && true)); //뒤에 것 보지도 않아도 false. 따라서 앞쪽 false만 보고, true는 죽은 코드
		System.out.println("false와 false의 논리 and 연산 : " + (false && false));
		System.out.println("true와 true의 논리 or 연산 : " + (true || true));
		System.out.println("true와 false의 논리 or 연산 : " + (true || false));
		System.out.println("false와 true의 논리 or 연산 : " + (false || true));
		System.out.println("false와 false의 논리 or 연산 : " + (false || false));
		
		
		/* 2. 논리식(조건식)에 논리 연산자 활용*/
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인:" + (a<b && c<d));
	}

}
