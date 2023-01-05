package chap03.lecture;

public class Application7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 20;
		int second = 10;
		Application7 app7 = new Application7();
		System.out.println("두 수를 더한 결과:" + app7.plusTwoNumbers(first, second));
		System.out.println("두 수를 뺀 결과:" + app7.minusTwoNumbers(first, second));
		System.out.println("두 수를 곱한 결과:" + app7.multipleTwoNumbers(first, second));
		System.out.println("두 수를 나눈 몫:" + app7.divideTwoNumbers(first, second));
		
		
		/*
		 * 매개변수와 리턴값 복합 활용 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
		 * 
		 */
	}
	
	/**
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 더하여 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 더하기를 할 첫 번째 정수
	 * @param second 더하기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 더한 결과
	 * */
	public int plusTwoNumbers(int first, int second) {
		return first + second;
	}
	
	/**
	 * <pre>
	 * 매개변수로 전달 받은 두 수를 이용하여
	 * 첫 번째 매개변수로 전달받은 정수에서 두 번째 매개변수로 전달받은 정수를 뺀 결과값을 반환하는 기능 제공
	 * </pre>
	 * @param first 빼기를 할 첫번째 정수
	 * @param second 빼기를 할 두 번째 정수
	 * @return 매개변수로 전달 받은 두 수를 더한 결과
	 * */
	public int minusTwoNumbers(int first, int second) {
		return first - second;
	}
	
	public int multipleTwoNumbers(int first, int second) {
		return first * second;
	}
	
	
	//현재로는 나누기 0을 막을 수는 없다.
	public int divideTwoNumbers(int first, int second) {
		return first/second;
	}
	

}
