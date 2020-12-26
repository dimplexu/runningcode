package com.dimple.headfirst.strategy;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		// 这里调用MallardDuck继承来的performQuack()，进而委托给该对象的QuackBehavior对象处理，
		// 也就是说，调用继承来的QuackBehavior的quack(),performFly同理
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		// 第一次调用，不会飞
		model.performFly();
		// 调用继承来的setter方法，把火箭动力飞行的行为定到模型鸭中，模型鸭能一飞冲天
		model.setFlyBehavior(new FlyRocketPowered());
		// 这样就成功的改变了行为
		model.performFly();
	}
}
