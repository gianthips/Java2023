package chap03.lecture;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메소드란? 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 */
		
		System.out.println("main() 시작됨...");
		
		Application1 app1 = new Application1();
		app1.methodA();

		System.out.println("main() 종료됨...");

	}
	
	public void methodA() {
		System.out.println("methodA() 호출함...");
		methodB();//static이 안붙었을 경우에는 이렇게 호출하면 된다.
		System.out.println("methodA() 종료됨...");
	}
		
	public void methodB() {
		System.out.println("methodB() 호출함...");
		System.out.println("methodB() 종료됨...");
		return;//모든 method에는 return이 생략되어있다.
	}

}