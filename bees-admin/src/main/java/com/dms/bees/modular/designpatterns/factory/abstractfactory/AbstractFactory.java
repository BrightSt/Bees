package com.dms.bees.modular.designpatterns.factory.abstractfactory;

/**
 * 抽象工厂类
 */
public abstract class AbstractFactory {

    public abstract Vehicle createVehicle();

    public abstract Weapon createWeapon();

    public abstract Food createFood();
}
