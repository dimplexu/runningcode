package com.dimple.headfirst.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		// 一开始，我们的模型呀不会飞
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	void display() {
		System.out.println("I'm a model duck");
	}

}
