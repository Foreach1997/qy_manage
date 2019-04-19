package com.qy.dao;

import com.qy.entity.TestEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {

    public List<TestEntity> findAll();
}
