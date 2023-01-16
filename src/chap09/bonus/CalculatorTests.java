package chap09.bonus;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
	
	@Test //ctrl 1 add JUnit 5 library하면 import가 하나 된다.
	@DisplayName("sumTwoNumber에 10과 20을 전달하여 잘 더해지는지 확인")
	public void testSumTwoNumber() {
		Calculator calc = new Calculator();
		int result = calc.sumTwoNumbers(10,20);
		int expected = 30;
		assertEquals(expected, result); // 메소드 하나가 제대로 동작하는지 단위테스트! 근데 method가 void 형이면 return 값이 없어서 비교하기 힘들어. 비교하여 true, false 나타내줌
	}
	@Test
	@DisplayName("sumTwoNumber에 30과 50을 전달하여 잘 더해지는지 확인")
	public void testSumTwoNumer2() {
		Calculator calc = new Calculator();
		int result= calc.sumTwoNumbers(30,50);
		int expected = 60;
		assertEquals(expected, result);
	}
}
