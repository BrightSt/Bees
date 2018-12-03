package com.dms.bees.multi.test;

import com.dms.bees.base.BaseJunit;
import com.dms.bees.multi.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 业务测试
 *
 * @author dms
 * @date 2017-06-23 23:12
 */
public class BizTest extends BaseJunit {

    @Autowired
    TestService testService;

    @Test
    public void test() {
        testService.testbees();

        testService.testBiz();

        //testService.testAll();
    }
}
