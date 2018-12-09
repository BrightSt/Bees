package com.dms.bees.modular.designpatterns.factory.simple;

/**
 * 工厂模式测试类
 * @author Dong
 *
 */
public class Test {

    public static void main(String[] args) {
//		Moveable m = new Plane();
//		m.run();

//		PlaneFactory factory = new PlaneFactory();
//		Plane plane = factory.createPlane();
//		
//		CarFactory carFactory = new CarFactory();
//		Car car = carFactory.createCar();

//		VehicleFactory vehicleFactory1 = new PlaneFactory(); 
//		Moveable moveable = vehicleFactory1.create();
//		moveable.run();

        VehicleFactory vehicleFactory1 = new CarFactory();  // 只需改变CarFactory() 即可   这个模式为：简单工厂(工厂方法)
        Moveable moveable = vehicleFactory1.create();
        moveable.run();

    }

}
