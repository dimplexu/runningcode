package com.dimple.headfirst.strategy;

/**
 * 
 * @Title:
 * @Description: 飞翔实现类
 * @Copyright:
 * @Company:
 * @author:XuYue
 * @version:Neon.3 Release (4.6.3)
 * @Create Date Time: 2019年3月20日 下午12:48:35
 * @Update Date Time: 2019年3月20日 下午12:48:35
 * @see
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		// 实现鸭子的飞行
		System.out.println("I'm flying!!!");
	}

}
