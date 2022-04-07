package com.uin.service.impl;

import com.uin.mapper.AdminMapper;
import com.uin.pojo.Admin;
import com.uin.pojo.AdminExample;
import com.uin.service.AdminService;
import com.uin.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:32 AM
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    /**
     * 完成登陆判断
     *
     * @param name
     * @param pwd
     * @return com.uin.pojo.Admin
     * @author wanglufei
     * @date 2022/4/7 10:34 AM
     */
    @Override
    public Admin login(String name, String pwd) {
        //根据传入的用户到数据库中去查询相应的用户对象
        //如果有条件，则一定要创建AdminExample的对象，用来封装条件
        AdminExample example = new AdminExample();
        //添加用户名a_name条件
        example.createCriteria().andANameEqualTo("name");
        List<Admin> list = adminMapper.selectByExample(example);
        if (list.size() > 0) {
            Admin admin = list.get(0);
            //如果查询到用户对象，在进行密码的匹配
            //将用户输入的密码进行加密，在和数据库中的密码对比
            String md5 = MD5Util.getMD5(pwd);
            String s = admin.getaPass();
            if (md5.equals(s)) {
                return admin;
            }
        }
        return null;
    }
}
