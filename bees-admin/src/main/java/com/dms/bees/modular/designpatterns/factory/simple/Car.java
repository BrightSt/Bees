package com.dms.bees.modular.designpatterns.factory.simple;

public class Car implements Moveable{

    private static Car car = new Car();

    public Car() {}

    public static Car getInstance() {
        return car;
    }

    @Override
    public void run() {
        System.out.println("car run");

    }

}
