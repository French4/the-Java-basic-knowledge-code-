package SinglePattern;

public class SingleTon {
	public static int status = 1;
	//����˽�л�
	private SingleTon() {}
	
	private static SingleTon instance = new SingleTon();
	private static SingleTon getSingleTon() {
		return instance;
	}
}
