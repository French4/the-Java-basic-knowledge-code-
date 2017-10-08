package SinglePattern;

public class SingleTon {
	public static int status = 1;
	//构造私有化
	private SingleTon() {}
	
	private static SingleTon instance = new SingleTon();
	private static SingleTon getSingleTon() {
		return instance;
	}
}
