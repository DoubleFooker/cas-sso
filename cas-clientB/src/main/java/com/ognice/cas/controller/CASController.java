package com.ognice.cas.controller;

import com.ognice.cas.conf.CASConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 描述：
 *
 * @Author Oumuv
 * @Date 2018/10/19 12:15
 **/
@Controller
public class CASController {

    @Autowired
    private CASConfig casConfig;
    @RequestMapping("index")
    @ResponseBody
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://localhost:8080/#/home");
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        //使用cas退出成功后,跳转到http://cas.client1.com:9003/logout/success
        return "redirect:"+casConfig.getClientLogoutUrl();

    }
    @RequestMapping("logout/success")
    public String logoutsuccess(HttpSession session) {
        return "logoutsuccess";
    }
}
