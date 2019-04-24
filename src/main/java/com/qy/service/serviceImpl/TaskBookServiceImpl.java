package com.qy.service.serviceImpl;

import com.qy.entity.WorkStaff;
import com.qy.service.TaskBookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TaskBookServiceImpl implements TaskBookService {


    @Override
    public Object insertWorkStaff(WorkStaff workStaff) {
        return null;
    }
}
