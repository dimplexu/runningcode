package com.dimple.headfirst.decorator.starbuzzsize;

/**
 * 
 * @Title:
 * @Description: 必须让CondimentDecorator能够取代Beverage，所以将CondimentDecorator扩展自Beverage类
 */
public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	// 所有的调料装饰者都必须重新实现getDescription()方法
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}
