package chap04.question;

import java.util.Scanner;

public class Application4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("체중[kg]를 입력하세요: ");
		int weight = sc.nextInt();
		System.out.println("신장[cm]를 입력하세요: ");
		int height = sc.nextInt();
		
		double BMI = weight / (height*height/10000);
		
		if(BMI<20) {
			System.out.println("당신은 저체중 입니다.");
		}else if(BMI>=20 && BMI<=25) {
			System.out.println("당신은 정상체중 입니다.");			
		}else if(BMI>=25 && BMI<=30) {
			System.out.println("당신은 과체중 입니다.");			
		}else {
			System.out.println("당신은 비만입니다.");
		}
		
		/* BMI(신체질량지수)를 계산하고, 계산된 값에 따라 
		 * 저체중(20 미만)인 경우 "당신은 저체중 입니다.", 
		 * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.", 
		 * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.", 
		 * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
		 * 
		 * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
		 * 
		 * 계산 예시) BMI = 67 / (1.7 * 1.7)
		 * */
		
	}
	
}
