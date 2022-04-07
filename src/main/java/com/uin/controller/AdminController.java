package com.uin.controller;

import com.uin.pojo.Admin;
import com.uin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:49 AM
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    /**
     * 完成登陆判断，并跳转页面
     *
     * @param name
     * @param pwd
     * @return java.lang.String
     * @author wanglufei
     * @date 2022/4/7 10:52 AM
     */
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request) {
        Admin admin = adminService.login(name, pwd);
        if (admin != null) {
            request.setAttribute("admin", admin);
            return "main";
        } else {
            request.setAttribute("errmsg", "用户名和密码不正确！");
            return "login";
        }

    }
}
