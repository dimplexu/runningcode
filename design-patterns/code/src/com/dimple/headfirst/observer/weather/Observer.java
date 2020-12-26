package com.dimple.headfirst.observer.weather;

public interface Observer {
	/**
	 * 
	 * @Title: update
	 * @Description: 当气象观测值改变时候，主题会把这些状态值当做方法的参数，传递给观察者
	 * @param temp  温度
	 * @param humidity  湿度
	 * @param pressure 气压
	 * @throws
	 */
	public void update(float temp, float humidity, float pressure);
}
