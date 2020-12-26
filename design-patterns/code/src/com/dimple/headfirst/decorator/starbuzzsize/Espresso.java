package com.dimple.headfirst.decorator.starbuzzsize;

/**
 * 
 * @Description:首先，让Espresso扩展自Beverage类，因为Espresso是一种饮料
 * @author:XuYue
 */
public class Espresso extends Beverage {

	public Espresso() {
		// 为了要设置饮料的描述，我们写了一个构造器，description继承自Beverage
		description = "Espresso";
	}
	
	// 需要计算Espresso的价钱
	@Override
	public double cost() {
		return 1.99;
	}

}
