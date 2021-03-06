package com.qy.dao;

import com.qy.entity.Notice;

import java.util.List;
import java.util.Map;

public interface NoticeMapper {


    public List<Notice> findNotice(Map<String,Object> map);

    public int findNoticeCount(Map<String,Object> map);

    public int insert(Notice notice);

    public List<Notice> findNoticeMax(Notice notice);

    public int delNotice(Notice notice);
}
