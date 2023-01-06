package chap05.lecture;

import java.util.Random;
import java.util.Scanner;

public class A_for {

	public void testSimpleForStatement() {

		/*[for문 표현식]
		 * for(초기식; 조건식; 증감식){}
//		 * 
//		 * 
//		 * */
//
//		/*
//		 * int i = 1; for(;i<=10;i++); 이렇게 해도 된다.
//		 */
//		
//		for(int i =1; i<=10; i++) {
//			//for(int i=1; ; i++) 이렇게 하면 계속 증가. true가 들어간거.
//			System.out.println(i);
//		}//빠져나올 때 i는 11이 된다.
//		
//		String str1 = "hello";
//		for(int i = 0; i<=str1.length(); i++) {
//			System.out.println(str1.charAt(i));
//		}
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 :");
		String str2 = sc1.nextLine();
		for(int i = 0; i<str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
	}
		
		public void testForExample() {
//			5명의 학생 이름을 받아 출력을 해보자.
//			이때, 한 명 이름 입력받은 후 한 명 이름 출력을 반복
			Scanner sc2 = new Scanner(System.in);
			
			System.out.print("1번째 학생 이름을 입력해주세요:");
			String student1 = sc2.nextLine();
			System.out.println("1번째 학생 이름은" + student1 + "입니다.");

			System.out.print("2번째 학생 이름을 입력해주세요:");
			String student2 = sc2.nextLine();
			System.out.println("2번째 학생 이름은" + student1 + "입니다.");

			System.out.print("3번째 학생 이름을 입력해주세요:");
			String student3 = sc2.nextLine();
			System.out.println("3번째 학생 이름은" + student1 + "입니다.");

			System.out.print("4번째 학생 이름을 입력해주세요:");
			String student4 = sc2.nextLine();
			System.out.println("4번째 학생 이름은" + student1 + "입니다.");

			System.out.print("5번째 학생 이름을 입력해주세요:");
			String student5 = sc2.nextLine();
			System.out.println("5번째 학생 이름은" + student1 + "입니다.");

			for(int i = 1; i<=5; i++) {
				System.out.print(i+"번째 학생의 이름을 입력해주세요 : ");
				String student = sc2.nextLine();
				System.out.println(i+"번째 학생 이름은" + student + "입니다.");
			}
		}
		
		public void testForExample2() {
			/*1~10까지의 합계를 구하시오
			 * */
//			int num1 = 1;
//			int num2 = 2;
//			int num3 = 3;
//			int num4 = 4;
//			int num5 = 5;
//			int num6 = 6;
//			int num7 = 7;
//			int num8 = 8;
//			int num9 = 9;
//			int num10 = 10; //지역변수는 반드시 초기화가 되어야 한다.
//			
//			int sum =0;//일단 반드시 초기화를 해줘야 한다.
//
//			sum += num1;
//			sum += num2;
//			sum += num3;
//			sum += num4;
//			sum += num5;
//			sum += num6;
//			sum += num7;
//			sum += num8;
//			sum += num9;
//			sum += num10;
//			
//			System.out.println("sum: " + sum);
			
			int sum = 0;
			
			for(int i =1; i<=10; i++) {
				sum += i;
			}
			
			System.out.println("sum:" + sum);
						
			
		}
		
		public void testForExample3() {
			
			int sum = 0;
			double rint1 = 0;
			int rint2 = 0;
			
			rint1 = Math.random();
			rint2 = (int)(rint1*6+5);
			System.out.println(rint2);
			
			
			for(int i =1; i<=rint2; i++){
				sum += i;				
			}/* 5~10 사이의 난수를 발생시켜서
			 * 1부터 발생한 난수까지의 합을 출력하세요
			 * */
			System.out.println("sum:" + sum);
			
		}
		public void testForExample4() {
			/* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요.
			 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다.
			 * 첫 번째 정수가 반드시 작아야 하는 것은 아니다.
			 * */
//			int num1 = 0;
//			int num2 = 0;
//			
			Scanner sc41 = new Scanner(System.in);
			System.out.print("첫번째 정수를 입력해주세요: ");
			int num1 = sc41.nextInt();
			
			Scanner sc42 = new Scanner(System.in);
			System.out.print("두번째 정수를 입력해주세요: ");
			int num2 = sc42.nextInt();
						
			int snum=0;
			int bnum=0;
			
			if (num1 < num2) {
				snum = num1;
				bnum = num2;
			}else if (num2 < num1) {
				bnum = num1;
				snum = num2;
			}else {
				snum = num1;
				bnum = num1;
			}	
			
			int sum = 0;
//			int range = bnum - snum;
//			
			
			for(int i=0; (snum+i)<=bnum; i++){
				// for(int i = min; i<=max; i++){ 이렇게 단순하게 할 수도 있네.
				sum += (snum+i);				
			}/* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하세요.
			 * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다.
			 * 첫 번째 정수가 반드시 작아야 하는 것은 아니다.
			 * */
			System.out.println("sum:" + sum);
			
		}
		
		public void printSimpleGugudan() {
			/*키보드로 2~9 사이의 숫자를 입력받아, 
			 * 2~9 사이인 경우 해당 단의 구구단을 출력
			 * 그렇지 않은 경우 반드시 2~9 사이의 양수를 입력해야 합니다.
			 * 출력*/
			Scanner scgu = new Scanner(System.in);
			System.out.print("2~9 사이 구구단 숫자를 입력하세요: ");
			int gu = scgu.nextInt();
			
			if(gu>=2 && gu<=9) {
				System.out.println("잘 입력하였습니다.");
				for(int i = 1; ((i>=1) && (i<=9)); i++) {
					System.out.println(gu+"*"+i+"="+gu*i);
				}
			}else {
				System.out.print("반드시 2~9 사이의 양수를 입력해야 합니다.");
			}			
		}
		
		public void printTriangleStart() {
			Scanner sctr = new Scanner(System.in);
			System.out.print("줄 수를 입력하세요: ");
			int line = sctr.nextInt();
			
			for(int i = 1; i<=line ; i++){
					System.out.println();
				for(int j = 1; j<=i; j++){
					System.out.print("*");					
				}
			}
			
		}
		
				
	}

