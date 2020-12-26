package com.dimple.headfirst.observer.weather;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData WeatherData;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.WeatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;
		
		if (temp > maxTemp) {
			maxTemp = temp;
		}
		
		if (temp < minTemp) {
			minTemp = temp;
		}
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

	

}
