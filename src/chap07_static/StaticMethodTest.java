package chap07_static;

public class StaticMethodTest {
	
	private int count;
	
	public void nonStaticMethod() {
		this.count++;
		System.out.println("nonStaticMethod 호출됨..");
	}
	
	public static void staticMethod() {
//		this.count++; 이렇게 하면 에러난다. static이 붙으면 시스템이 처음 실행될 때 동작한다. 그러니 this는 사용할 수 없음.
		System.out.println("staticMethod 호출됨..");
		
	}

}
