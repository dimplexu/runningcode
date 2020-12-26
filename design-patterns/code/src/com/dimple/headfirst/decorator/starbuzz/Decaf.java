package com.dimple.headfirst.decorator.starbuzz;

/**
 * 
 * @Description:首先，让Decaf扩展自Beverage类，因为Espresso是一种饮料
 * @author:XuYue
 */
public class Decaf extends Beverage {

	public Decaf() {
		// 为了要设置饮料的描述，我们写了一个构造器，description继承自Beverage
		description = "Decaf Coffee";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
