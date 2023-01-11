package chap07_object.encapsulation;

public class Application2 {
	
	public static void main(String[] args) {
		
		Monster monster1 = new Monster2();
		monster1.name = "드라큘라";
		monster1.hp = 200;
		
		Monster monster2 = new Monster2();
		monster1.name = "프랑켄";
		monster1.hp = 300;
		
		Monster monster3 = new Monster2();
		monster1.name = "미이라";
		monster1.hp = 400;
		
		System.out.println(monster1.name);
		System.out.println(monster1.hp);
		System.out.println(monster2.name);
		System.out.println(monster2.hp);
		System.out.println(monster3.name);
		System.out.println(monster3.hp);		
	}
}
