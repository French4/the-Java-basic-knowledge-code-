package Subject;




import DisplayElement.DisplayElementInterface;
import Observer.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElementInterface{

	private float temperature;
	private float humidity;
	private WeatherData weatherData;

	public  CurrentConditionsDisplay(WeatherData weatherData) {  //构造器需要注册weatherData对象
		this.weatherData = weatherData;
		System.out.println(weatherData);
		weatherData.registerObserver(this);
	}


	public void update(float temperature2, float humidity2, float pressure) {
		this.temperature = temperature2;
		this.humidity = humidity2;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + temperature + "F　degress and" + humidity + "% humidity");
	}
}
