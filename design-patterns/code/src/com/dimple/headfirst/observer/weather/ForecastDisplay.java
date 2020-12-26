package com.dimple.headfirst.observer.weather;

/**
 * 
 * @Title:
 * @Description: 实现Observer接口，所以可以从WeatherData对象中获得改变
 * 也实现了DisplayElement接口，因为我们的API规定所有布告板都必须实现此接口
 */
public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentPressure = 29.92f;
	private float lastPressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// 当update()被调用时，我们把温度和湿度保存起来，然后调用display()
	@Override
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler,rainy weather");
		}
	}
}
