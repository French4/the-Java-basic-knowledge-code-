package Observer;

import Subject.CurrentConditionsDisplay;
import Subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		//首先建立一个weatherData独享
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay cunrrentDisplay = new CurrentConditionsDisplay(weatherData);  //建立一个观察者,传入被观察者对象
		
		weatherData.setMeasurements(80, 85, 78);
	}
}
