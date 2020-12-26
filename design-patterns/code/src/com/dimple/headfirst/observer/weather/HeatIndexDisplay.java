package com.dimple.headfirst.observer.weather;

/**
 * 
 * @Title:
 * @Description: 实现Observer接口，所以可以从WeatherData对象中获得改变
 * 也实现了DisplayElement接口，因为我们的API规定所有布告板都必须实现此接口
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
	
	private float heatIndex = 0.0f;
	private Subject weatherData;
	
	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float t, float rh, float pressure) {
		heatIndex = computeHeatIndex(t, rh);
		display();
	}

	private float computeHeatIndex(float t, float rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) 
				+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) 
				+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
				(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 * 
				(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) + 
				(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
				0.000000000843296 * (t * t * rh * rh * rh)) -
				(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		return index;
	}
	
	@Override
	public void display() {
		System.out.println("Heat index is " + heatIndex);
	}
}
