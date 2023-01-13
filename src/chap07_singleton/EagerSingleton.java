package chap07_singleton;

public class EagerSingleton {
	private static EagerSingleton eager = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return eager;
	}
	
}
