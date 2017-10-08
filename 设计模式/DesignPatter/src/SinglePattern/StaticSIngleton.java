package SinglePattern;

public class StaticSIngleton {
	private StaticSIngleton() {
		
	}
	/*
	 * 定义一个静态内部类，用来实例化单例对象
	 * */
	private static class SingletonHolder{
		private static StaticSIngleton instance = new StaticSIngleton();
	}
	
	public static StaticSIngleton getInstance() {
		return SingletonHolder.instance;
	}
}
