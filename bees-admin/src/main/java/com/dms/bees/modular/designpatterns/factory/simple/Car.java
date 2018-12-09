package com.dms.bees.modular.designpatterns.factory.simple;

/**
 * 汽车类
 */
public class Car implements Moveable{

    @Override
    public void run() {
        System.out.println("car run");
    }
}