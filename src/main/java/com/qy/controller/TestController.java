package com.qy.controller;

import com.qy.service.serviceImpl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class TestController {

        @Autowired
        private TestServiceImpl testServiceImpl;

        @ResponseBody
        @RequestMapping("/findAll")
        public  Object findAll(){
                System.out.println("1");
          return   testServiceImpl.findAll();
        }


}
