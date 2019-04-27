package com.qy.dao;

import com.qy.entity.ProChange;
import com.qy.entity.ProWarn;

public interface ProChangeMapper {


    int insert(ProChange proWarn);


    int delete(ProWarn proWarn);

    ProChange findProChange(ProChange proChange);
}
