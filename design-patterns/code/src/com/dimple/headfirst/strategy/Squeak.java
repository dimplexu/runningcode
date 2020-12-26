package com.dimple.headfirst.strategy;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		// 橡皮鸭子吱吱叫
		System.out.println("squeak");

	}

}
