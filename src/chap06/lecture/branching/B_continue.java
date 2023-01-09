package chap06.lecture.branching;

public class B_continue {

	public void testSimpleContinueStatement() {
		/* continue 문은 반복문 내에서 사용한다.
		 * 해당 반복문의 회차를 중간에 멈추고 다시 증감식으로 넘어가게 한다.
		 * 일반적으로 if(조건식){continue;}처럼 사용된다.
		 */
		
		/*1부터 100사이의 값 출력
		 * 단, 5의 배수이면서 5의 배수인 값만 출력
		 */
		
		for(int i = 1; i<=100; i++) {
			if(!(i%4==0&&i%5==0)) {
				continue; //계속 끊어서 for문으로 돌아가다가 4와 5의 배수일 때 문지기 역할을 하여 system.out.println을 함.
				//연산의 횟수가 줄어들기에 속도가 좀 빨라진다. continue나 break의 장점
			}
			System.out.println(i);
		}
	}
}
