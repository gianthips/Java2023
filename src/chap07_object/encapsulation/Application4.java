package chap07_object.encapsulation;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster4 monster1 = new Monster4();
		// monster1.kinds = "프랑켄슈타인"; //왜 안보여? private 설정 때문임.
		
		monster1.setKinds("프랑켄슈타인");
		monster1.setHp(200);
		
		System.out.println(monster1.getInfo());
		//
	}

}
