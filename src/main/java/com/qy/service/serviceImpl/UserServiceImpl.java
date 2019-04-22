package com.qy.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy.dao.CurrencyMapper;
import com.qy.dao.DepartmentMapper;
import com.qy.dao.RoleMapper;
import com.qy.dao.UserMapper;
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
import java.util.ArrayList;
import java.util.List;

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
    public Object updateUser(User user) {
        int val = userMapper.updateByPrimaryKeySelective(user);
        if (val != 0){
            return ResultRespose.rsult(200, "修改成功", null);
        }
        return ResultRespose.rsult(200, "修改失败", null);
    }

    @Override
    public Object quit(HttpServletRequest request) {
        request.getSession().removeAttribute("userId");
        return ResultRespose.rsult(200, "退出登录", null);
    }

    @Override
    public Object userInsert(User user) {
        //用于该部门是否已经拥有部门经理了
        if (user.getRoleId()==2) {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andRoleIdEqualTo(2).andDepIdEqualTo(user.getDepId());
            long count = userMapper.countByExample(userExample);
            if (count != 0) {
                return ResultRespose.rsult(200, "该部门已经有部门经理了", null);
            }
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andEmailEqualTo(user.getEmail());
        long count = userMapper.countByExample(userExample);
        if (count!=0){
            return ResultRespose.rsult(200, "该用户已存在", null);
        }else {
            userMapper.insert(user);
            return ResultRespose.rsult(200, "添加成功", null);
        }
    }

    @Override
    public Object findUserList(User user,HttpServletRequest request, SupportPage supportPage) throws ParseException {
        List<User> userList = null;
        User u = userMapper.selectByPrimaryKey((int)request.getSession().getAttribute("userId"));
        if (u.getRoleId()==2) {
            user.setDepId(u.getDepId());
        }
        user.setRoleId(u.getRoleId());

        //分页查询
        PageHelper.startPage(supportPage.getCurrentPage(),supportPage.getPageSize());
        userList =  currencyMapper.findUserList(user);
        PageInfo pageInfo = new PageInfo(userList);
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
        return ResultRespose.rsultRespose(200,"查询成功",res,pageInfo.getTotal());
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
}
