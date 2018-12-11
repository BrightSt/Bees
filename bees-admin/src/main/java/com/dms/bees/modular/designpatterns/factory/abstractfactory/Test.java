package com.dms.bees.modular.designpatterns.factory.abstractfactory;

public class Test {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MagicFactroy();  //  只需要修改 new MagicFactroy(); 即可以整体替换下面的工厂
        Food food = abstractFactory.createFood();
        food.printName();
        Vehicle vehicle = abstractFactory.createVehicle();
        vehicle.run();
        Weapon weapon = abstractFactory.createWeapon();
        weapon.shoot();

//        Car car = new Car();
//        car.run();
//
//        AK47 ak47 = new AK47();
//        ak47.shoot();
//
//        Apple apple = new Apple();
//        apple.getName();
    }
}
