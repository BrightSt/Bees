package com.dms.bees.modular.designpatterns.sington;

/**
 * 单例模式思路：该类只有一个对象（实例化）
 * 客户端不允许创建对象，在自己类里面创建对象，客户端反复使用。
 * 优点：减少了创建对象的时间和空间成本
 * 使用场景：一些工具类
 *
 */
public class Car{

    private Car(){} // 私有化构造方法，其他类里不允许创建对象了

    private static Car car = new Car();

    /**
     * 通过静态方法获取对象
     * @return
     */
    public static Car getInstance(){
        return car;
    }

}