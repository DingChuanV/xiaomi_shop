package com.uin.service;

import com.uin.pojo.Admin;

/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:31 AM
 */
public interface AdminService {
    /**
     * 完成登陆判断
     *
     * @param name
     * @param pwd
     * @return com.uin.pojo.Admin
     * @author wanglufei
     * @date 2022/4/7 10:33 AM
     */
    Admin login(String name, String pwd);
}
