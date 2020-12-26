package com.dimple.headfirst.decorator.starbuzz;

/**
 * 
 * @Description:首先，让DarkRoast扩展自Beverage类，因为Espresso是一种饮料
 * @author:XuYue
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		// 为了要设置饮料的描述，我们写了一个构造器，description继承自Beverage
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
