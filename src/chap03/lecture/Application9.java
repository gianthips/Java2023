package chap03.lecture;

public class Application9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*다른 클래스에 작성한 메소드 호출*/
		int first = 100;
		int second = 50;
		/*1. non-static 메소드*/
		Calculator calc = new Calculator(); 
		int min = calc.minNumberOf(first, second);
		
		System.out.println("두 수 중 최솟값은 : " + min);
		
		/*2. static 메소드*/
		int max = Calculator.maxNumberOf(first,second);
		//static 메소드는 굳이 객체를 만들어 쓰지 않는다.
		System.out.println("두 수 중 최대값은:" + max);
		
		/*
		 * 주의! static 메소드도 non-static 메소드처럼 호출은 가능하다.
		 * 권장하지 않는다.
		 */
		
		int max2 = calc.maxNumberOf(first, second);
		
		System.out.println("두 수 중 더 큰 값은:" + max2);

	}

}
