package com.dimple.headfirst.observer.weatherobervable;

// 1：记得要导入（import）正确的Observer/Observable
import java.util.Observable;

/**
 * 
 * @Title:
 * @Description: 2：我们现在正继承Observable
 * 3：我们不需要追踪观察者了，也不需要管理注册与删除（让超类代劳即可）。
 * 我们把注册、添加、通知的相关代码删除
 */
public class WeatherDataNew extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	// 4：我们的构造器不再需要为了记住观察者们而建立数据结构了
	public WeatherDataNew() {
		
	}
	
	public void measurementsChanged() {
		// 5: 调用notifyObservers()之前，要先调用setChanged()来指示状态已经改变
		setChanged();
		// 注意：我们没有调用notifyObservers()传送数据对象，这表示我们采用的做法是拉
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	// 6：这些并不是新方法，只是因为我们要使用“拉”的做法，所以才提醒你有这些方法。观察者会利用这些方法取得WeatherData对象的状态
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
