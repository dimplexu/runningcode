package com.dimple.headfirst.decorator.starbuzz;

/**
 * 
 * @Description:
 * 摩卡是一个装饰者，所以让它扩展自CondimentDecorator
 * CondimentDecorator扩展自Beverage
 * @author:XuYue
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
