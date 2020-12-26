package com.dimple.headfirst.factory.simplefactory;

public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	// 你需要更多的披萨类型传入orderPizza()
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = factory.createPizza(type);
				
		// 一旦我们有了披萨，需要做一些必要的工作。每个Pizza的子类型都知道如何准备自己
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
