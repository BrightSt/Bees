package com.dms.bees.modular.designpatterns.factory.abstractfactory;

/**
 * 魔法工厂类
 */
public class MagicFactroy extends AbstractFactory{
    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Food createFood() {
        return new MushRoom();
    }
}
