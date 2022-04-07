package com.uin.mapper;

import com.uin.pojo.Admin;
import com.uin.pojo.AdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:25 AM
 */
public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
