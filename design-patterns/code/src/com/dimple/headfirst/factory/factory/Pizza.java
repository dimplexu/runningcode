package com.dimple.headfirst.factory.factory;

import java.util.ArrayList;

abstract public class Pizza {

	String name;
	String dough;
	String sauce;
	
	ArrayList<String> toppings = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	@Override
	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}

	
}
