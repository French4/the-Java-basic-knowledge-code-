package SinglePattern;

public class LazySingleTon {
	private LazySingleTon() {}
	
	private static LazySingleTon instance = null;
	public static synchronized LazySingleTon getInstance() {
		if(instance == null)
			instance = new LazySingleTon();
		return instance;
	}
}
