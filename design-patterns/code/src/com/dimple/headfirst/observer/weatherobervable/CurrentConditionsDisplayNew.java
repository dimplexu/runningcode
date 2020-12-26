package com.dimple.headfirst.observer.weatherobervable;

import java.util.Observable;
// 1:导入正确的Observer/Observable
import java.util.Observer;


/**
 * 
 * @Title:
 * @Description: 2:我们正在实现java.util.Observer接口
 */
public class CurrentConditionsDisplayNew implements Observer, DisplayElement {
	
	Observable observable;
	private float temperature;
	private float humidity;
	
	// 3：构造器需要 Observable当参数，并将 CurrentConditionsDisplay对象登记成观察者
	public CurrentConditionsDisplayNew(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	// 4：改变update方法，增加Observable和数据对象作为参数
	@Override
	public void update(Observable obs, Object arg) {
		// 5：在update()中，先确定可观察者属于WeatherData类型，然后利用getter方法获取温度和湿度测量值，最后调用display() 
		if (obs instanceof WeatherDataNew) {
			WeatherDataNew weatherDataNew = (WeatherDataNew)obs;
			this.temperature = weatherDataNew.getTemperature();
			this.humidity = weatherDataNew.getHumidity();
			display();
		}
	}

	// 显示温度和湿度
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
	}
}
