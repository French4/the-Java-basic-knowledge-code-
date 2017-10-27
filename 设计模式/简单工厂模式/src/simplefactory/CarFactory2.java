package simplefactory;
/*
 * 简单工厂另一种模式,也叫作静态工厂模式,增加新的子类只能修改代码,违反开闭原则。
 * */
public class CarFactory2 {
	public static Car createAudi() {
		return new Audi();
	}
	public static Car createByd() {
		return new byd();
	}
}
