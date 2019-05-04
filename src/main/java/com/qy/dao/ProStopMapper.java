package com.qy.dao;


import java.util.List;

import com.qy.entity.ProStop;

public interface ProStopMapper {


    int insert(ProStop proStop);


    int delete(ProStop proStop);

    List<ProStop> findProStop(ProStop proStop);

}
