package chap03.lecture;

public class Application5 {

	public static void main(String[] args) {
		/*메소드 리턴 테스트*/
		/*모든 메소드 내부에는 return이라는 값이 존재한다*/
		//하지만 지금까지 작성하지 않은 것은 void 형일 경우에는 complier가 자동으로 추가해주기 때문
		//return의 정확한 의미. 현재 진행 중인 것을 강제 종료 하고 호출한 구문으로 다시 돌아가라는 명령어. 
		Application5 app5 = new Application5();
		app5.testMethod();
		
	}
	public void testMethod() {
		System.out.println("testMethod() 동작 확인...");
		/*
		 * if(true) { return;// }
		 */ //이런식으로 구문 중간에 섞어 쓸 수도 있다.
//		return;
		//System.out.println("Hello World!"); return 밑에 달았기 때문에 절대로 도달할 수 없는 코드가 된다. 
	}
}
