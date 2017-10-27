package Observer;

import Subject.CurrentConditionsDisplay;
import Subject.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		//���Ƚ���һ��weatherData����
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay cunrrentDisplay = new CurrentConditionsDisplay(weatherData);  //����һ���۲���,���뱻�۲��߶���
		
		weatherData.setMeasurements(80, 85, 78);
	}
}
