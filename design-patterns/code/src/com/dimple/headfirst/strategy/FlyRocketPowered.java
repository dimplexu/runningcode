package com.dimple.headfirst.strategy;

/**
 * 
 * @Title:
 * @Description: 建立一个利用火箭动力的飞行行为
 * @Copyright:
 * @Company:
 * @author:XuYue
 * @version:Neon.3 Release (4.6.3)
 * @Create Date Time: 2019年3月20日 下午1:09:53
 * @Update Date Time: 2019年3月20日 下午1:09:53
 * @see
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a  rocket");
	}

}
