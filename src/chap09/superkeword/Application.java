package chap09.superkeword;

public class Application {
	public static void main(String[] args) {
		
		ProductDTO product1 = new ProductDTO();
		System.out.println(product1.getInformation());
		
		ProductDTO product2 = new ProductDTO("S-01234","삼성","갤럭시폴드",23900000, new java.util.Date());
		System.out.println(product2.getInformation());
		
		ComputerDTO computer1 = new ComputerDTO();
		System.out.println(computer1.getInformation());
		
		ComputerDTO computer2 = new ComputerDTO("퀄컴 스냅드래곤", 512, 12, "안드로이드"); // 부모 필드가 super()로 되어있어서 아무것도 호출하지 않음
		System.out.println(computer2.getInformation());
		
		ComputerDTO computer3 = new ComputerDTO("S-01234", "삼성", "갤럭시폴드", 23900000, new java.util.Date(),
				"퀄컴 스냅드래곤", 512, 12, "안드로이드");
		System.out.println(computer3.getInformation());
		
	}
}
