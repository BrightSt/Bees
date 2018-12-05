package com.dms.bees.rest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * bees REST Web程序启动类
 *
 * @author dms
 * @date 2017年9月29日09:00:42
 */
public class BeesRestServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BeesRestApplication.class);
    }

}
