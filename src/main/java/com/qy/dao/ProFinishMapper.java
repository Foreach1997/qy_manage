package com.qy.dao;

import java.util.List;

import com.qy.entity.ProFinish;

public interface ProFinishMapper {


    int insert(ProFinish proFinish);


    int delete(ProFinish proFinish);

    List<ProFinish> findProFinish(ProFinish proFinish);

}
