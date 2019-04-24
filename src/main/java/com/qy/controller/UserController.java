package com.qy.controller;


import com.qy.dao.UserMapper;
import com.qy.entity.Department;
import com.qy.entity.User;
import com.qy.service.DepartmentService;
import com.qy.service.UserService;
import com.qy.util.Captcha;
import com.qy.util.ResultRespose;
import com.qy.util.SupportPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private DepartmentService departmentService;

    /**
     * 用户登录
     */
     @ResponseBody
     @RequestMapping("/login")
     public Object userLogin(User user, HttpServletRequest request,String checkCode){

         if (!checkCode.equals(request.getSession().getAttribute("simpleCaptcha").toString())){
             return ResultRespose.rsult(300,"验证码不正确",null);
         }
         return userService.userLogin(user,request);
     }

    /**
     * 添加部门
     */
     @ResponseBody
     @RequestMapping("/insertDep")
     public Object insetDep(Department department, HttpServletRequest request){

        return departmentService.insertDep(department);
     }

    /**
     * 员工信息插入
     */
    @ResponseBody
    @RequestMapping("/insertUser")
    public Object insertUser(User user, HttpServletRequest request){

        return userService.userInsert(user);
    }

    /**
     * 用户列表查询(roleId , depId) 用于总经理和部门经理
     */
    @ResponseBody
    @RequestMapping("/findUserList")
    public Object findUserList(User user, HttpServletRequest request, SupportPage supportPage) throws ParseException {

        return userService.findUserList(user,request,supportPage);
    }

    /**
     * 验证码
     */
    @ResponseBody
    @RequestMapping("/captcha")
    public String imageCode(HttpServletRequest request, HttpServletResponse response){
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");

        OutputStream os = null;
        try {
            os = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回验证码和图片的map
        Map<String,Object> map = Captcha.getImageCode(86, 37, os);
        String simpleCaptcha = "simpleCaptcha";
        request.getSession().setAttribute(simpleCaptcha, map.get("strEnsure").toString().toLowerCase());
        request.getSession().setAttribute("codeTime",new Date().getTime());
        try {
            ImageIO.write((BufferedImage) map.get("image"), "jpg", os);
        } catch (IOException e) {
            return "";
        }   finally {
            if (os != null) {
                try {
                    os.flush();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 用户信息修改
     */
    @ResponseBody
    @RequestMapping("/updateUser")
    public Object updateUser(User user,HttpServletRequest request){
       return  userService.updateUser(user);
    }


    /**
     * 用户登录检查
     */
    @ResponseBody
    @RequestMapping("/checkLogin")
    public Object checkLogin(HttpServletRequest request){
        return  userService.checkCode(request);
    }

    /**
     * 用户信息回调
     */
    @ResponseBody
    @RequestMapping("/userInfo")
    public Object userInfo(User user){
        return userService.userInfo(user);
    }

    /**
     *
     */
    @ResponseBody
    @RequestMapping("/dep")
    public Object getDep(Department department){
        return departmentService.findAllDepartment(department);
    }

    @ResponseBody
    @RequestMapping("/findUsers")
    public Object findUsers(User user){
        return userService.findUsers(user);
    }
}
