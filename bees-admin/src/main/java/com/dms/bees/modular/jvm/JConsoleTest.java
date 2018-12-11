package com.dms.bees.modular.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * jconsole 分析工具
 */
public class JConsoleTest {



    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(500);
        List<Demo> list = new ArrayList<>();
        for (int i = 0;i<1000;i++){
            Thread.sleep(100);
            list.add(new Demo());
        }
     }
}

class Demo{

    public byte []b = new byte[128*1024];

}