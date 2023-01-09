package chap06.question;

import java.util.Random;
import java.util.Scanner;

/*문제. 0 이상의 십진수인 정수를 입력으로 받아, 이진수로 변환하는 프로그램을 작성하라.
 * 조건1. 0이상의 십진수가 아닌 정수가 입력으로 들어올 경우, 프로그램은 "수를 제대로 입력해."라는 메시지를 출력해야 한다.
 *(실수나 십진수가 아닌, 형이 다르거나 진법이 다른 숫자가 들어오는 것까지 고려할 필요는 없음.)
 * 조건2. 조건문과 반복문을 이용하라. 
 * 선택1. 배열의 개념을 안다면 이용해도 좋다.
 */
public class questionKSJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("0 이상의 십진수인 정수를 입력하세요: ");
		int num = sc.nextInt();
		if(num >= 0) {
			
			//첫번째 2로 나누기
			int re = num%2; //나머지
			int qu = (int)num/2; //몫
			if(re == 1) {
				System.out.print(1);
			}else {
				System.out.print(0);
			}

			//반복문을 이용하여 2로 나누기
			while(qu != 0 && qu != 1) {
				re = qu%2;  //나머지
				qu = (int)qu/2;  //몫
				
				if(re == 1){
					System.out.print(1);
				}
				else{
					System.out.print(0);
				}							
			}

			//종결과정
			if( (double)qu/2 > 0) {
				System.out.print(1);				
			}else {	}			
			
		}else {
			System.out.println("수를 제대로 입력해.");	
		}
		
	}

}
