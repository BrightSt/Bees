package com.dms.bees.modular.designpatterns.factory.simple;

/**
 * 测试类
 */
public class Test{
    public static void main(String[] args) {

       //VehicleFactory vehicleFactory = new CarFactory(); //  只需改变new CarFactory()即可
        VehicleFactory vehicleFactory = new PlaneFactory(); //  只需改变new CarFactory()即可
        Moveable moveable = vehicleFactory.create();
        moveable.run();
    }
}