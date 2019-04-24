package com.qy.service.serviceImpl;

import com.qy.dao.CurrencyMapper;
import com.qy.dao.WorkStaffMapper;
import com.qy.entity.WorkStaff;
import com.qy.service.TaskBookService;
import com.qy.util.ResultRespose;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class TaskBookServiceImpl implements TaskBookService {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");



    @Resource
    private WorkStaffMapper workStaffMapper;
    @Resource
    private CurrencyMapper currencyMapper;

    @Override
    public Object insertWorkStaff(WorkStaff workStaff, HttpServletRequest request) {
        workStaff.setCreateTiem(new Date());
        workStaff.setStatus(1);
        workStaff.setWorkLeadId((int)request.getSession().getAttribute("userId"));
        workStaffMapper.insert(workStaff);
        return ResultRespose.rsult(200,"添加成功",null);
    }

    @Override
    public Object findWorkTaskList(WorkStaff workStaff,HttpServletRequest request, SupportPage supportPage) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId",workStaff.getUserId());
        map.put("proCode",workStaff.getProCode());
        map.put("workLeadId",workStaff.getWorkLeadId());

        if (supportPage.getCurrentPage()!=null&&supportPage.getPageSize()!=null) {
            map.put("currentPage", (supportPage.getCurrentPage() - 1) * supportPage.getPageSize());
            map.put("pageSize", supportPage.getPageSize());
        }
        List<WorkStaff> workStaffs = currencyMapper.findWorkStaffList(map);
        int count = currencyMapper.findWorkStaffListCount(map);
        return ResultRespose.rsultRespose(200,"请求成功",workStaffs,count);
    }
}
