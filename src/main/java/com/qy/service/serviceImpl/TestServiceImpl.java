package com.qy.service.serviceImpl;

import com.qy.dao.TestMapper;
import com.qy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public Object findAll() {
        return testMapper.findAll();
    }
}
