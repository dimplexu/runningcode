package com.dimple.headfirst.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		// 绿头鸭使用Quack类处理呱呱叫，所以当performQuack()被调用，就把责任委托给Quack对象进行真正的呱呱叫
		quackBehavior = new Quack();
		// 使用FlyWithWings作为其FlyBehavior类型
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	void display() {
		System.out.println("I'm a read  Mallard duck");
	}

}
