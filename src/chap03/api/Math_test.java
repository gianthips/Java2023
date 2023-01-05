package chap03.api;
//아무리봐도 여기 Math라는 class는 없는데? 
//JRE System Library 속에 많은 것들이 있음. 이거 그냥 가져다 쓰는 것. 
public class Math_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*java.lang.Math를 확인해보려고 함
		 * Math class는 수학에서 잘 이용되는 함수들을 미리 구현해놓은 것
		 * */
		
		/*절대값*/
		System.out.println("-7의 절대값:" + Math.abs(-7));
		System.out.println("10과 20 중 더 작은 것?" + Math.min(10,20));
		
		/* 원주율 */
		System.out.println("원주율:" + Math.PI);
		
		/* 난수 */
		System.out.println("난수 발생:" + Math.random()); //난수의 범위가 1을 초과하지 않음
		
		/*1~10까지의 난수 발생*/
		int random1 = (int)(Math.random()*10+1);
		System.out.println("1~10사이 난수 발생:" + random1); //난수의 범위가 1을 초과하지 않음
		/*10~15까지의 난수 발생*/
		int random2 = (int)(Math.random()*5+10);
		System.out.println("10~15사이 난수 발생:" + random2); //난수의 범위가 1을 초과하지 않음
		/*-128~127까지의 난수 발생*/
		int random3 = (int)(Math.random()*255-128);
		System.out.println("-128~127사이 난수 발생:" + random3); //난수의 범위가 1을 초과하지 않음
		/*대문자 중 출력*/
		int ra = (int)(Math.random()*25+65);
		char random4 = (char)ra;
		System.out.println("대문자 중 랜덤픽:" + random4); //난수의 범위가 1을 초과하지 않음
	}

}