package com.qy.dao;

import com.qy.entity.ProFinish;

public interface ProFinishMapper {


    int insert(ProFinish proFinish);


    int delete(ProFinish proFinish);

    ProFinish findProFinish(ProFinish proFinish);

}
