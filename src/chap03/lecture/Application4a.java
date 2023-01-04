package chap03.lecture;

public class Application4a {

	public static void main(String[] args) {
		Application4a app4 = new Application4a();
		app4.testMethod(20);
		//app3.testMethod(20,30); //인자로 전달하는 값의 갯수와 매개변수의 갯수가 일치하지 않으면 호출할 수 없다.
		//app3.testMethod("40");  //인자로 전달하는 값의 자료형과 매개변수의 자료형이 일치하지 않으면 호출할 수 없다.
		//app3.testMethod();  //매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 호출할 수 없다.
		
		// 변수에 저장한 값 전달 테스트
		int age = 20;
		app4.testMethod(age);
		
		//자동형변환을 이용해서 값 전달 테스트
		byte byteAge = 10;
		app4.testMethod(byteAge);
		
		//강제형변환 이용하여 값 전달도 가능하고 연산 결과를 이용해서 값 전달도 가능하다.
	}
	
	public void testMethod(int age) {
		System.out.println("당신의 나이는" + age + "세 입니다.");
	}
}
