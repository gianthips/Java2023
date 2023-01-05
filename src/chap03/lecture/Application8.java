package chap03.lecture;

public class Application8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* static 메소드 호출 */
		/* static 메소드를 호출하는 방법
		 * 클래스명. 메소드명();
		 * */
		
		System.out.println("10과 20의 합: " + Application8.sumTwoNumbers(10,20));
		System.out.println("20과 30의 합: " + sumTwoNumbers(20,30));
			
	}

	//성능을 위해 static으로 하는 경우가 있는데, 남발하는 것은 좋지 않음. 나중에 설명함
	public static int sumTwoNumbers(int first, int second) {
		return first + second;
	}

}
