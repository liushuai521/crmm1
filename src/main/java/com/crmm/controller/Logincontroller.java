package com.crmm.controller;


import com.alibaba.fastjson.JSON;
import com.crmm.pojo.Login;
import com.crmm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@CrossOrigin
public class Logincontroller {
    @Autowired
    private LoginService ls;
    @GetMapping("/login")
    public void Login(HttpServletRequest request, HttpServletResponse response){
        String loginname = request.getParameter("loginname");
        String loginpwd = request.getParameter("loginpwd");
        Login list = ls.gatOne(loginname,loginpwd);
        String s = JSON.toJSONString(list);
        try {
            response.getWriter().print(list);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void yebo(){
        System.out.println("test");
    }
}
