package simplefactory;
/*
 * �򵥹�����һ��ģʽ,Ҳ������̬����ģʽ,�����µ�����ֻ���޸Ĵ���,Υ������ԭ��
 * */
public class CarFactory2 {
	public static Car createAudi() {
		return new Audi();
	}
	public static Car createByd() {
		return new byd();
	}
}
