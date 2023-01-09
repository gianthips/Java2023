package chap06.lecture.branching;

public class A_break {

	public void testSimpleBreakStatement() {
		/*
		 * break 문은 반복문 내부에서 사용한다.
		 * 해당 반복문을 빠져나올 때 사용하며,
		 * 조건문 판단 결과와 상관 없이 강제로 반복을 종료한다.
		 * 일반적으로 if(조건식){break;}처럼 사용된다.
		 * 단, switch문은 반복문이 아니지만 예외적으로 사용한다.
		 * */
		
		int sum = 0;
		int i = 1;
		while(true) {
			sum += i;
			
			if(i == 100) {
				break;
			}
			
			i++;
//			break;
//			
//			i++;
		}
		
		System.out.println("sum :" + sum);
				
	}
	
	public void testSimpleBreakStatement2() {
		/*break는 모든 반복문을 종료하는 것은 아니고, 자신에게 가장 인접한 반복문만 실행을 멈춘다*/
		
		for(int dan = 2; dan<10; dan++) {
						
			for(int su =1; su<10; su++) {
				if(su>5) {
					break;
				}
				
				System.out.println(dan + "*" + su + " = " + (dan * su));

			}
			System.out.println();
		}
	}

}
