package com.dimple.headfirst.decorator.starbuzz;

/**
 * 
 * @Title:
 * @Description: Beverage是一个抽象类，有两个方法：getDescription()以及cost()
 * @author:XuYue
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	// getDescription()已经在此实现了，但是cost()必须在子类中实现
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
