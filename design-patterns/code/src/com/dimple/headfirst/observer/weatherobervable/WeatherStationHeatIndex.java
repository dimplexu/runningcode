package com.dimple.headfirst.observer.weatherobervable;

public class WeatherStationHeatIndex {
	public static void main(String[] args) {
		WeatherDataNew weatherData = new WeatherDataNew();
		CurrentConditionsDisplayNew currentDisplay = new CurrentConditionsDisplayNew(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
