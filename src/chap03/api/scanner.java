package chap03.api;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("이름을 입력하세요:");
//		String name = sc.nextLine();
//		System.out.println("입력하신 이름은" + name + "입니다.");
//		
//		System.out.print("나이를 입력하세요:");
//		int age = sc.nextInt();
//		System.out.println("입력하신 나이는" + age + "입니다.");
//		
//		System.out.print("키를 입력해주세요:");
//		double height = sc.nextDouble();
//		System.out.println("입력하신 키는" + height + "입니다.");
//		
		System.out.print("참과 거짓 중에 한 가지를 true or false로 입력해주세요:");
		boolean isTrue = sc.nextBoolean();
		System.out.println("입력하신 논리 값은:" + isTrue + "입니다.");
	}

}
