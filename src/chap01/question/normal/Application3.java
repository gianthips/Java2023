package chap01.question.normal;

public class Application3 {
	public static void main(String[] args) {
	double var1 = 5.0;
	double var2 = 3.4;
	double var3 = 2.9;
	double var4 = 0.8;

	int result; 
	result = (int)var1+(int)var2+(int)var3 -(int)var4; // 내림 형변환
	double result2;
	result2 = result; // 올림 형변환
	System.out.println(result2);
	}
}
