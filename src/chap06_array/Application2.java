package chap06_array;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
		
		int randomShapeIndex = (int)(Math.random()*shapes.length);
		int randomCardNumberIndex = (int)(Math.random()*cardNumbers.length);
		
		System.out.println("당신이 뽑은 카드는" + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex]);
	}

}
