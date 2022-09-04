package com.crmm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.crmm.mapper.LoginMapper;
import com.crmm.pojo.Login;
import com.crmm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper lm;
    @Override
    public Login gatOne(String loginname,String loginpwd) {
        QueryWrapper qw = new QueryWrapper();
        qw.eq("loginname",loginname);
        qw.eq("loginpwd",loginpwd);
        return lm.selectOne(qw);
    }

}
