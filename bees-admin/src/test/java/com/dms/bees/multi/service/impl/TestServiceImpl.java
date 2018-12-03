package com.dms.bees.multi.service.impl;

import com.dms.bees.core.common.constant.DatasourceEnum;
import com.dms.bees.core.mutidatasource.annotion.DataSource;
import com.dms.bees.multi.entity.Test;
import com.dms.bees.multi.mapper.TestMapper;
import com.dms.bees.multi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dms
 * @since 2018-07-10
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    @DataSource(name = DatasourceEnum.DATA_SOURCE_BIZ)
    @Transactional
    public void testBiz() {
        Test test = new Test();
        test.setBbb("bizTest");
        testMapper.insert(test);
    }

    @Override
    @DataSource(name = DatasourceEnum.DATA_SOURCE_bees)
    @Transactional
    public void testbees() {
        Test test = new Test();
        test.setBbb("beesTest");
        testMapper.insert(test);
    }

    @Override
    @Transactional
    public void testAll() {
        testBiz();
        testbees();
        //int i = 1 / 0;
    }

}
