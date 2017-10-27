package Subject;

import Observer.Observer;

/**
 * 这是被观察者
 * @author lenovo
 *
 */
public interface Subject {
	public void registerObserver(Observer o); //注册观察者
	public void removeObserve(Observer o); //移除观察者
	public void notifyObservers();  //通知观察者只
}