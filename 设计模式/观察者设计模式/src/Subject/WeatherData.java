package Subject;

import java.util.ArrayList;

import Observer.Observer;
/**
 * 实现主题接口。主题接口只知道观察者实现了特定的接口
 * 将这个接口注入主题中,进行一个注册。
 * @author lenovo
 *
 */
public class WeatherData implements Subject{

	private ArrayList<Observer> Observers = new ArrayList<>();
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public  WeatherData() {
		Observers = new ArrayList<>();
	}
	
	//观察者在主题进行注册
	public void registerObserver(Observer currentConditionsDisplay) {
		Observers.add(currentConditionsDisplay);
	}
	
	public void removeObserve(Observer o) {
		int i = Observers.indexOf(o);
		if(i >= 0)
			Observers.remove(i);
	}
	
	//通知观察者的方式是调用观察者的update方法
	public void notifyObservers() {
		for(int i = 0; i < Observers.size(); i++) {
			Observer observer = Observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	//改变之后通知观察者
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		notifyObservers();
	}
}
