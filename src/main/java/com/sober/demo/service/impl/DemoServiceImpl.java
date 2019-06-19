package com.sober.demo.service.impl;

import com.sober.demo.dao.dto.SoberTest;
import com.sober.demo.dao.generatedMapper.SoberTestMapper;
import com.sober.demo.pojo.Data;
import com.sober.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Sober
 * @Date: 2018/10/29 18:59
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    SoberTestMapper soberTestMapper;

    @Override
    public Data getInfo() {
        SoberTest soberTest = soberTestMapper.selectByPrimaryKey(1);
        Data data = new Data();
        data.id = soberTest.getId();
        data.desc = soberTest.getValue();
        return data;
    }
}
