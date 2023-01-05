package chap03.lecture2;

import chap03.lecture.Calculator;
import static chap03.lecture.Calculator.maxNumberOf;//static import

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(50,60);
		System.out.println("50과 60 중 더 작은 값은?" + min);
		
		// static 메소드 호출
		int max = Calculator.maxNumberOf(50,60);
		
		System.out.println("50과 60 중 더 큰 값은" + max);
		
		int max2 = maxNumberOf(100,200);
		System.out.println("100과 200 중 더 큰 값은" + max2);
	}

}
