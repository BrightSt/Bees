package com.dms.bees.modular.designpatterns.factory.abstractfactory;

public class Apple extends Food{

    public void  getName(){
        System.out.println("apple");
    }

    @Override
    public void printName() {
        System.out.println("apple");
    }
}
