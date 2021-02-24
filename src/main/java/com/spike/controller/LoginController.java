package com.spike.controller;

import com.spike.utils.result.Result;
import com.spike.vo.LoginVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result doLogin(LoginVo loginVo){
        System.out.println(loginVo);
        return Result.ok();
    }
}
