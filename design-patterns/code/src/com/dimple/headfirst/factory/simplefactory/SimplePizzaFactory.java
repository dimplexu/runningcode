package com.dimple.headfirst.factory.simplefactory;

// 这个工厂只做一件事，帮他的客户创建披萨
public class SimplePizzaFactory {

	// 在工厂内定义一个方法createPizza()方法，所有客户用这个方法来实例化新对象
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
