package com.dimple.headfirst.strategy;

/**
 * 
 * @Title:
 * @Description: 呱呱叫实现
 * @Copyright:
 * @Company:
 * @author:XuYue
 * @version:Neon.3 Release (4.6.3)
 * @Create Date Time: 2019年3月20日 下午12:48:46
 * @Update Date Time: 2019年3月20日 下午12:48:46
 * @see
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		// 实现鸭子呱呱叫
		System.out.println("Quack");
	}

}
