package com.qy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pro")
public class ProController {

    /**
     * 项目人员分配
     */
    @ResponseBody
    @RequestMapping("/insertWorkStaff")
    public Object insertWorkStaff(){
        return  null;
    }

}
