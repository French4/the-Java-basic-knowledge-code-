package factoryMethod;
/*
 * ��������ģʽ:һ������ֻ����һ����Ӧ���࣬��չʱ��ֵ�����¹����Ϳ���.
 * */
public class Client {
	public static void main(String[] args) {
		Car c1 = new AudiFactory().createCar();
		Car c2 = new AudiFactory().createCar();
		
		c2.run();
		c1.run();
	}
}
