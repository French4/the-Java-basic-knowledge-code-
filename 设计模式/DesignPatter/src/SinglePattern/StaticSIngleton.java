package SinglePattern;

public class StaticSIngleton {
	private StaticSIngleton() {
		
	}
	/*
	 * ����һ����̬�ڲ��࣬����ʵ������������
	 * */
	private static class SingletonHolder{
		private static StaticSIngleton instance = new StaticSIngleton();
	}
	
	public static StaticSIngleton getInstance() {
		return SingletonHolder.instance;
	}
}
