package Subject;

import Observer.Observer;

/**
 * ���Ǳ��۲���
 * @author lenovo
 *
 */
public interface Subject {
	public void registerObserver(Observer o); //ע��۲���
	public void removeObserve(Observer o); //�Ƴ��۲���
	public void notifyObservers();  //֪ͨ�۲���ֻ
}