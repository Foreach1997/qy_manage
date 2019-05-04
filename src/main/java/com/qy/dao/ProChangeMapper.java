package com.qy.dao;

import java.util.List;

import com.qy.entity.ProChange;
import com.qy.entity.ProWarn;

public interface ProChangeMapper {


    int insert(ProChange proChange);


    int delete(ProChange proChange);

    List<ProChange> findProChange(ProChange proChange);
}
