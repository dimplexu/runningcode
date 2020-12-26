package com.dimple.headfirst.strategy;


public abstract class Duck {
	// 为行为接口类型声明两个引用变量，所有 鸭子类都继承他们
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	abstract void display();
	
	public void performQuack() {
		// 委托给呱呱叫行为类
		quackBehavior.quack();
	}
	
	public void performFly() {
		// 委托给飞行行为类
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("I can swim");
	}
}
