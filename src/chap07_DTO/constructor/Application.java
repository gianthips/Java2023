package chap07_DTO.constructor;

public class Application {

	public static void main(String[] args) {
		/*객체 생성 구문
		 * 클래스명 레퍼런스 변수 = new 클래스명();
		 * -> 클래스자료형 레퍼런스변수 = new 생성자함수();
		 * */
		
		/*생성자란?
		 * 인스턴스를 생성할 때 초기 수행할 명령을 작성하는 메소드의 변형체
		 * 단, 한번만 호출할 수 있다.
		 * 주로 사용할 목적은 필드를 초기화 할 목적.
		 */
		
		User user1 = new User();
//		new Scanner(System.in); scanner()로는 못쓴다. 기본생성자 제공 안함.
		
		
	}

}