package chap05.lecture;

public class A_for {

	public void testSimpleForStatement() {

		/*[for문 표현식]
		 * for(초기식; 조건식; 증감식){}
		 * 
		 * 
		 * */

		/*
		 * int i = 1; for(;i<=10;i++); 이렇게 해도 된다.
		 */
		
		for(int i =1; i<=10; i++) {
			//for(int i=1; ; i++) 이렇게 하면 계속 증가. true가 들어간거.
			System.out.println(i);
		}//빠져나올 때 i는 11이 된다.
		
		String str = "hello";
		for(int i = 0; i<=str.length(); i++) {
			System.out.println(str.charAt(i));
		}
				
	}

}
