package com.dms.bees.generator.action;


import com.dms.bees.generator.action.config.beesGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author dms
 * @Date 2017/5/21 12:38
 */
public class beesCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        beesGeneratorConfig beesGeneratorConfig = new beesGeneratorConfig();
        beesGeneratorConfig.doMpGeneration();

        /**
         * bees的生成器:
         *      bees的代码生成器可以生成controller,html页面,页面对应的js
         */
        beesGeneratorConfig.dobeesGeneration();
    }

}