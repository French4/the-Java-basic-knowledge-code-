package factoryMethod;
/*
 * 工厂方法模式:一个工厂只产生一个对应的类，扩展时候值增加新工厂就可以.
 * */
public class Client {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new AudiFactory().createCar();
		
		c2.run();
		c1.run();
	}
}
