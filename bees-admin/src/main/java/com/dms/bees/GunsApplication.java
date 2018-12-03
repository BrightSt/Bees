package com.dms.bees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot方式启动类
 *
 * @author dms
 * @Date 2017/5/21 12:06
 */
@SpringBootApplication
public class beesApplication {

    private final static Logger logger = LoggerFactory.getLogger(beesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(beesApplication.class, args);
        logger.info("beesApplication is success!");
    }
}
