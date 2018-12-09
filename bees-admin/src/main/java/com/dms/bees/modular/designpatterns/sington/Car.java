package com.dms.bees.modular.designpatterns.sington;

/**
 * 单例模式思路：
 * 只返回一个对象
 * 1。客户端不允许创建对象，创建对象的操作在自身创建(构造器私有化，提供静态方法)
 * 2。
 * @author Dong
 *
 */
public class Car {
	
	private static Car car = new Car();
	
	private Car() {}
	
	public static Car getInstance() { // 静态工厂方法
		return car;
	}
}
