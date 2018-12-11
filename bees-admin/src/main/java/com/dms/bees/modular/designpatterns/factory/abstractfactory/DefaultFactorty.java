package com.dms.bees.modular.designpatterns.factory.abstractfactory;

/**
 * 默认工厂类
 */
public class DefaultFactorty  extends AbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }
}
