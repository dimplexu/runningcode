package com.dimple.headfirst.decorator.starbuzz;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// 订一杯Espresso，不需要调料
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// 订一杯双倍Mocha加Whip的DarkRoast()咖啡
		Beverage beverage2 = new DarkRoast();
		// 用Mocha装饰它
		beverage2 = new Mocha(beverage2);
		// 用第二个Mocha装饰它
		beverage2 = new Mocha(beverage2);
		// 用Whip装饰它
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		// 订一杯调料为Soy、Mocha、Whip的HouseBlend咖啡
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
	}
}
