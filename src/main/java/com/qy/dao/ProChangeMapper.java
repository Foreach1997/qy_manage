package com.qy.dao;

import com.qy.entity.ProChange;
import com.qy.entity.ProWarn;

public interface ProChangeMapper {


    int insert(ProChange proChange);


    int delete(ProChange proChange);

    ProChange findProChange(ProChange proChange);
}
