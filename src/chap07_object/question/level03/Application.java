package chap07_object.question.level03;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*기본 생성자*/
		EmployeeDTO emp1 = new EmployeeDTO();
		
		
		/*setter*/
		System.out.println("사원의 번호를 입력하세요:");
		emp1.setNumber(sc.nextInt());
		sc.nextLine();//이걸 입력을 안해주면 nextInt에서 숫자 뒤의 엔터를 받아주는 곳이 없음. 그래서 받아줄 놈이 필요함.
		
		System.out.println("사원의 이름을 입력하세요:");
		emp1.setName(sc.nextLine());	
//		sc.nextLine();	
		
		System.out.println("사원의 부서를 입력하세요:");
		emp1.setDept(sc.nextLine());
//		sc.nextLine();
		
		System.out.println("사원의 직위을 입력하세요:");
		emp1.setJob(sc.nextLine());
//		sc.nextLine();
		
		System.out.println("사원의 나이를 입력하세요:");
		emp1.setAge(sc.nextInt());
		sc.nextLine();		//받아주는 놈
		
		System.out.println("사원의 성별을 입력하세요:");
		emp1.setGender(sc.next().charAt(0));
		sc.nextLine(); //받아주는 놈
		
		System.out.println("사원의 봉급을 입력하세요:");
		emp1.setSalary(sc.nextInt());
		sc.nextLine();
				
		System.out.println("사원의 성과급를 입력하세요:");
		emp1.setBonusPoint(sc.nextDouble());
		sc.nextLine();
				
		System.out.println("사원의 전화번호를 입력하세요:");
		emp1.setPhone(sc.nextLine());
//		sc.nextLine();
		
		System.out.println("사원의 주소를 입력하세요:");
		emp1.setAddress(sc.nextLine());
//		sc.nextLine();
		
		System.out.println("============================");
		
		/*getter*/
		System.out.println(emp1.getNumber());
		System.out.println(emp1.getName());
		System.out.println(emp1.getDept());
		System.out.println(emp1.getJob());
		System.out.println(emp1.getAge());
		System.out.println(emp1.getGender());
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getBonusPoint());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getAddress());
			
		
	}

}
