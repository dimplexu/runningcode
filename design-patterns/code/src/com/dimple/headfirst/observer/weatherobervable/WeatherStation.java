package com.dimple.headfirst.observer.weatherobervable;

public class WeatherStation {
	public static void main(String[] args) {
		// 建立有一个WeatherData对象
		WeatherDataNew weatherData = new WeatherDataNew();
		
		// 建立布告板，把WeatherData对象传给它们
		CurrentConditionsDisplayNew currentConditionDisplay = new CurrentConditionsDisplayNew(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
