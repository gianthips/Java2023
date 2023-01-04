package chap01.question.team;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 주당 5만원하는 종목을 200주 사서, 총 1000만원의 주식을 매수했을 경우 
		 * 주식 수수료와 주가가 올라 주당 5만원에서 6만원이 되었을때
		 * 주식을 매도하면 수수료는 얼마인가?
		 * 매수 수수료 공식 = 구매금액 * 0.015% 
		 * 매도시 위탁 수수료 (오른금액 * 0.015%) + (오른총매도금액 * 0.3%)
		 */
		double a = 0.015;
		double b = 0.3;
		
		System.out.println("trade commission : " + (10000000 * a)/100);
		System.out.println("trade commission : " + ((12000000 * a)/100 + (12000000 * b)/100));
	}

}
