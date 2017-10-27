package simplefactory;
/*
 * 在没有工厂模式的情况下
 * */
public class Client01 {
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new byd();
		
		c1.run();
		c2.run();
	}
}
