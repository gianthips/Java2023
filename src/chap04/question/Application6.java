package chap04.question;

import java.util.Scanner;

public class Application6 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과일 이름을 입력하세요:  ");
		
		String f1 = "사과";
		String f2 = "바나나";
		String f3 = "복숭아";
		String f4 = "키위";
		
		String fruit = sc.nextLine();
		
		if(fruit.equals(f1) || fruit.equals(f2) || fruit.equals(f3) || fruit.equals(f4)) {
			if(fruit.equals(f1)) {
				System.out.println("사과 :  1000원");
			}else if(fruit.equals(f2)) {
				System.out.println("바나나 :  1000원");
			}else if(fruit.equals(f3)) {
				System.out.println("복숭아 :  1000원");
			}else {
				System.out.println("키위 :  1000원");
			}
//			System.out.println("잘 입력하였습니다");
		}else {
			System.out.println("준비된 상품이 없습니다.");
		}
		
		
		
		/* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면 
		 * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
		 * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
		 * 
		 * -- 상품 가격 --
		 * 사과 :  1000원
		 * 바나나 : 3000원
		 * 복숭아 : 2000원
		 * 키위 : 5000원
		 * 
		 * -- 입력 예시 --
		 * 과일 이름을 입력하세요 : 바나나
		 * 
		 * -- 출력 예시 --
		 * 바나나의 가격은 3000원 입니다.
		 * */
		
	}

}
