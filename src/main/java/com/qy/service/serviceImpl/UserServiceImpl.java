package com.qy.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy.dao.*;
import com.qy.entity.Notice;
import com.qy.entity.Role;
import com.qy.entity.User;
import com.qy.entity.UserExample;
import com.qy.service.UserService;
import com.qy.util.ResultRespose;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Resource
    private UserMapper userMapper;

    @Resource
    private DepartmentMapper departmentMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private CurrencyMapper currencyMapper;

    @Resource
    private NoticeMapper noticeMapper;

    @Override
    public Object userLogin(User user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserExample userExample = new UserExample();
        UserExample.Criteria userExampleCriteria= userExample.createCriteria();
        userExampleCriteria.andEmailEqualTo(user.getEmail());
        userExampleCriteria.andPasswordEqualTo(user.getPassword());
        List<User> u = userMapper.selectByExample(userExample);
        if (u.size() == 1){
            session.setAttribute("userId",u.get(0).getUserId());
            session.setAttribute("roleId",u.get(0).getRoleId());
            session.setAttribute("depId",u.get(0).getDepId());
            session.setMaxInactiveInterval(30*60);
            System.out.println(session.getAttribute("depId"));
         return ResultRespose.rsult(200,"登陆成功",u.get(0));
        }else {
          return ResultRespose.rsult(300,"账号或者密码错误",null);
        }
    }

    @Override
    public Object updateUser(User user,String isUpdate) {
        if ("yes".equals(isUpdate)) {
            if (user.getRoleId() == 2) {
                UserExample userExample = new UserExample();
                userExample.createCriteria().andDepIdEqualTo(user.getDepId()).andRoleIdEqualTo(user.getRoleId());
                long count = userMapper.countByExample(userExample);
                if (count > 0) {
                    return ResultRespose.rsult(200, "该部门已经有了部门经理", null);
                }
            }
        }
        int val = userMapper.updateByPrimaryKeySelective(user);
        if (val != 0){
            return ResultRespose.rsult(200, "修改成功", null);
        }
        return ResultRespose.rsult(200, "修改失败", null);
    }

    @Override
    public Object quit(HttpServletRequest request) {
        request.getSession().removeAttribute("userId");
        request.getSession().removeAttribute("roleId");
        request.getSession().removeAttribute("depId");
        return ResultRespose.rsult(200, "退出登录", null);
    }

    @Override
    public Object userInsert(User user) {
        //用于该部门是否已经拥有部门经理了
        if (user.getRoleId() == 2) {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andDepIdEqualTo(user.getDepId()).andRoleIdEqualTo(user.getRoleId());
            long count = userMapper.countByExample(userExample);
            if (count > 0) {
                return ResultRespose.rsult(200, "该部门已经有了部门经理", null);
            }
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andEmailEqualTo(user.getEmail());
        long count = userMapper.countByExample(userExample);
        if (count!=0){
            return ResultRespose.rsult(200, "该用户已存在", null);
        }else {
            user.setCreateTime(new Date());
            userMapper.insert(user);
            return ResultRespose.rsult(200, "添加成功", null);
        }
    }

    @Override
    public Object findUserList(User user,HttpServletRequest request, SupportPage supportPage) throws ParseException {
        List<User> userList = null;
        Map<String,Object> map = new HashMap<String,Object>();
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
        if (u.getRoleId()==2) {
            map.put("depId",u.getDepId());
        }
        map.put("roleId",u.getRoleId());
        map.put("userName", user.getUserName());
        if (supportPage.getCurrentPage()!=null&&supportPage.getPageSize()!=null) {
            map.put("currentPage", (supportPage.getCurrentPage() - 1) * supportPage.getPageSize());
            map.put("pageSize", supportPage.getPageSize());
        }
        //分页查询
        userList =  currencyMapper.findUserList(map);
         int count = currencyMapper.findUserListCount(map);
        List<JSONObject> res = new ArrayList<JSONObject>();
        //在此处对员工信息做出封装
        for (User e: userList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("userId",e.getUserId());
            Role role=  roleMapper.selectByPrimaryKey(e.getRoleId());
            jsonObject.put("roleName",role.getRoleName());
            jsonObject.put("permissionId",role.getPermissionId());
            jsonObject.put("roleId",e.getUserId());
            jsonObject.put("email",e.getEmail());
            jsonObject.put("phone",e.getPhone());
            jsonObject.put("depId",e.getDepId());
            jsonObject.put("sex",e.getSex()==0? "女":"男");
            jsonObject.put("userName",e.getUserName());
            jsonObject.put("depName",departmentMapper.selectByPrimaryKey(e.getDepId()).getDepName());
            jsonObject.put("createTime",format.format(new Timestamp(e.getCreateTime().getTime())));
            res.add(jsonObject);
        }
        return ResultRespose.rsultRespose(200,"查询成功",res,count);
    }

    @Override
    public Object checkCode(HttpServletRequest request) {

        Object userId = request.getSession().getAttribute("userId");
        if (userId ==null || "".equals(userId)){
            return ResultRespose.rsult(300, "登录失效", null);
        }
        return ResultRespose.rsult(200, "成功", null);
    }

    @Override
    public Object userInfo(User user) {
        User u = userMapper.selectByPrimaryKey(user.getUserId());
        return ResultRespose.rsult(200, "成功", u);    }

    @Override
    public Object findUsers(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andDepIdEqualTo(user.getDepId()).andRoleIdEqualTo(3);
        List<User> userList = userMapper.selectByExample(userExample);
        return ResultRespose.rsult(200,"成功",userList);
    }

    @Override
    public Object addNotice(Notice notice,HttpServletRequest request) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
        if (notice.getDepId() == null){
            notice.setDepId(u.getDepId());
        }
        notice.setCreateTime(new Date());
        notice.setUserId(u.getUserId());
        notice.setRoleId(u.getRoleId());
        noticeMapper.insert(notice);
        return ResultRespose.rsult(200,"成功",null);
    }

    @Override
    public Object getNotice(Integer depId,HttpServletRequest request) {
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
        Notice n = new Notice();
        n.setDepId(u.getDepId());
        if (depId!=null){
            n.setDepId(depId);
        }
        Notice notice = noticeMapper.findNoticeMax(n);
        return ResultRespose.rsult(200,"成功",notice);
    }

    @Override
    public Object getAllNotice(Notice notice, SupportPage supportPage, HttpServletRequest request) {
        Map<String,Object> map = new HashMap<String, Object>();
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
        if (u.getRoleId()>1){
            map.put("userId",u.getUserId());
        }
        if (supportPage.getCurrentPage()!=null&&supportPage.getPageSize()!=null) {
            map.put("currentPage", (supportPage.getCurrentPage() - 1) * supportPage.getPageSize());
            map.put("pageSize", supportPage.getPageSize());
        }
        List<Notice> notices = noticeMapper.findNotice(map);

        int count = noticeMapper.findNoticeCount(map);

        List<JSONObject> jsonObjects = new ArrayList<JSONObject>();
        for (Notice n:notices){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("depName","");
            if (n.getDepId()!=0){
                jsonObject.put("depName",departmentMapper.selectByPrimaryKey(n.getDepId()).getDepName());
            }
            jsonObject.put("createTime",format.format(n.getCreateTime()));
            jsonObject.put("userName",userMapper.selectByPrimaryKey(n.getUserId()).getUserName());
            jsonObject.put("note",n.getNote());
            jsonObject.put("noticeId",n.getNoticeId());
            jsonObjects.add(jsonObject);
        }
        return ResultRespose.rsultRespose(200,"成功",jsonObjects,count);
    }

    @Override
    public Object delNotice(Integer noticeId, HttpServletRequest request) {
            Notice n = new Notice();
            n.setNoticeId(noticeId);
            noticeMapper.delNotice(n);
            return ResultRespose.rsult(200,"成功",null);
    }
}
