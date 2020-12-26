package com.dimple.headfirst.strategy;

/**
 * 
 * @Title:
 * @Description:不会飞的实现类
 * @Copyright:
 * @Company:
 * @author:XuYue
 * @version:Neon.3 Release (4.6.3)
 * @Create Date Time: 2019年3月20日 下午12:48:21
 * @Update Date Time: 2019年3月20日 下午12:48:21
 * @see
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		// 鸭子什么都不会做，不会飞
		System.out.println("I can't fly");
	}

}
