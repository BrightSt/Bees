package com.dms.bees;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * bees Web程序启动类
 *
 * @author dms
 * @date 2017-05-21 9:43
 */
public class BeesServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BeesApplication.class);
    }
}
