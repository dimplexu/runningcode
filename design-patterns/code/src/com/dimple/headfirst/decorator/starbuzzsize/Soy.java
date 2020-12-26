package com.dimple.headfirst.decorator.starbuzzsize;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += 0.10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += 0.15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += 0.20;
		}
		return cost;
	}

}
