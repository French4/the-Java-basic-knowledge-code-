package simplefactory;
/*
 * 简单工厂
 * */
public class CarFactory {
	public static Car createCar(String type) {
		if("奥迪".equals(type)) {
			return new Audi();
		}else if("比亚迪".equals(type)) {
			return new byd();
		}else {
			return null;
		}
	}
}
