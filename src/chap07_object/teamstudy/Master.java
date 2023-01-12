package chap07_object.teamstudy;
import java.util.Scanner;

public class Master {
	private int species;
	private String[] kimbab = new String[species];
	private int[] choice = new int[species]; 
	private int[] amount = new int[species];
	private int[] price = new int[species];
	private int[] sum = new int[species];
	

//	public void initialize() {
//		
//		this.species = 0;
//		this.amount = 0;
//		this.price = 0;
//		this.sum = 0;
//	}
	//일단 초기화는 관두자.
	
	//호출 시 메뉴를 알려준다.
	public void menuNotice() {
		System.out.println("=====메뉴=====");
		System.out.println("1. 야채김밥: 1,000원");
		System.out.println("2. 참치김밥: 2,000원");
		System.out.println("3. 김치김밥: 1,500원");
		System.out.println("우리는 카드만 받습니다!^^");
	}
			
	//호출 시 주문하는 김밥의 종류 수를 입력받는다.
	public void orderTotalSpecies() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("(키오스크)주문하려는 김밥은 몇 종류 입니까?");
		this.species = sc.nextInt();	
		System.out.println(species + "종류");
		
		this.kimbab = new String[species];
		this.choice = new int[species]; 
		this.amount = new int[species];
		this.price = new int[species];
		this.sum = new int[species];
		
		
	}

	
	//호출 시 주문하려는 김밥의 각 종류별 갯수를 입력받는다.
	public void orderSpecies() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(키오스크)주문하려는 김밥의 번호를 하나씩 말씀해주세요.");
		for(int i = 0; i<species; i++) {
			int gimspecies = sc.nextInt();
			if(gimspecies==1) {
				this.kimbab[i] = "야채김밥";
				this.choice[i] = 1;
				this.price[i] = 1000;
				System.out.println("[입력값]야채김밥");
			} else if(gimspecies==2){
				this.kimbab[i] = "참치김밥";
				this.choice[i] = 2;
				this.price[i] = 2000;
				System.out.println("[입력값]참치김밥");
			} else if(gimspecies==3) {
				this.kimbab[i] = "김치김밥";
				this.choice[i] = 3;
				this.price[i] = 1500;
				System.out.println("[입력값]김치김밥");
			} else {
				System.out.println("(키오스크)잘못된 번호를 입력하셨습니다. 프로그램을 다시 구동해주세요.");
				System.exit(0);
			}
		}
//		return kimbab;
//		return choice;
//		return price; 리턴은 하나 밖에 안되는데, 일단 잘 모르겠다. 객체 자체를 리턴해야한다.
//		초기화 객체를 하나 만들고, this를 이용하는 방식은 어떤가.
	}
		
//	호출시 주문하려는 김밥의 각 종류별 갯수를 입력받는다.
	public void orderAmount() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("(키오스크)주문하려는 김밥의 각 종류별 갯수를 말씀해주세요.");
		for(int i = 0; i<species; i++) {
			System.out.println(kimbab[i]+"은(는)?");			
			int temp = sc.nextInt();
//			System.out.println("first indicator");	
//			System.out.println("temp 값은" + temp);	
			
			
			
//			this.amount[i] = sc.nextInt();
//			System.out.println(amount[i]+"입력하였습니다.");
			
			if(temp>=1) {
				this.amount[i] = temp;
				System.out.println("[입력값] "+amount[i]+"입력하였습니다.");
			}else{
				System.out.println("(키오스크)갯수를 잘못 입력하셨습니다. 프로그램을 다시 구동해주세요.");
				System.exit(0);				
			}
		}
		
//		return amount; 일단 갯수 종류 이런거는 간단하게 하자
	}
	
	//호출시 전체 주문 내역의 가격 총합을 계산한다.
	public void calculator() {
		int sumtemp = 0;
		
		for(int i = 0; i<species; i++) {
			this.sum[i] = price[i]*amount[i];
		}
		
		for(int i = 0; i<species; i++) {
			sumtemp = sumtemp + this.sum[i];
		}
		System.out.println("(키오스크) "+"전체 금액은 " + sumtemp+"입니다.");		
	}
	
	//호출시 
	public void ordercomp() {
		String[] summary = new String[species];
		String totalorder = ""; 
		for(int i = 0; i<species; i++) {
			summary[i] = kimbab[i] + " " + amount[i] + "개" + " ";
			totalorder = totalorder + summary[i];
		}
		System.out.println("(키오스크)" + totalorder + " 주문 받았습니다.");
		System.out.println("(키오스크)주문하신 " + totalorder + " 나왔습니다.");
		
	}
	
//	public void foodcomp() {
//		String overall = ordercomp();
//		
//	}
//	
}
