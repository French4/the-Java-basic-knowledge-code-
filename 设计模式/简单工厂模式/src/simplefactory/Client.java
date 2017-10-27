package simplefactory;
/*
 * 简单工厂模式
 * */
public class Client {
	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("奥迪");
		Car c2 = CarFactory.createCar("比亚迪");
		
		c1.run();
		c2.run();
	}
}
