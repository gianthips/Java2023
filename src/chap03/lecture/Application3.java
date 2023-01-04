package chap03.lecture;

public class Application3 {

	public static void main(String[] args) { //굳이 여기에 변수 넣을 필요 없다.
		
		/*전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출*/
		//어제 했던 변수는 굳이 구분하자면 지역변수임.
		/*
		 * 변수의 종류. 메모리에서
		 * 1. 지역변수 stack 에 생김
		 * 2. 매개변수 stack에 생김
		 * 3. 전역변수(필드) heap에 생김
		 * 4. 클래스(static)변수 static에 생김
		 * */
		
		int age = 20;
		new Application3().method(age);//인자
	}
	
	public void method(int age) {
		System.out.println();
		return;
	}
}