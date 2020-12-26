package com.dimple.headfirst.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	void display() {
		System.out.println("I'm a rubber Duck");
	}

}
