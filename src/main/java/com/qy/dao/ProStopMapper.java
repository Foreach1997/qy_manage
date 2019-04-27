package com.qy.dao;


import com.qy.entity.ProStop;

public interface ProStopMapper {


    int insert(ProStop proStop);


    int delete(ProStop proStop);

    ProStop findProStop(ProStop proStop);

}
