package Subject;

import java.util.ArrayList;

import Observer.Observer;
/**
 * ʵ������ӿڡ�����ӿ�ֻ֪���۲���ʵ�����ض��Ľӿ�
 * ������ӿ�ע��������,����һ��ע�ᡣ
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
	
	//�۲������������ע��
	public void registerObserver(Observer currentConditionsDisplay) {
		Observers.add(currentConditionsDisplay);
	}
	
	public void removeObserve(Observer o) {
		int i = Observers.indexOf(o);
		if(i >= 0)
			Observers.remove(i);
	}
	
	//֪ͨ�۲��ߵķ�ʽ�ǵ��ù۲��ߵ�update����
	public void notifyObservers() {
		for(int i = 0; i < Observers.size(); i++) {
			Observer observer = Observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	//�ı�֮��֪ͨ�۲���
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		notifyObservers();
	}
}
