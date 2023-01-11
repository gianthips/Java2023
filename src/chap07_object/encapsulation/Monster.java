package chap07_object.encapsulation;

public class Monster {
	String name;
	int hp; //this.hp
	
	public void setHp(int hp) {
		if(hp>0) {
			System.out.println("양수 값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
			this.hp = hp; // line 5의 hp에다가 메소드로 받은 hp를 대입한다. 
		}else {
			System.out.println("0보다 작거나 같은 값이 입력되어 몬스터 체력을 0으로 변경합니다.");
		}
	}
}
