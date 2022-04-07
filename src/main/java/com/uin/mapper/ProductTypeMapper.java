package com.uin.mapper;

import com.uin.pojo.ProductType;
import com.uin.pojo.ProductTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:25 AM
 */
public interface ProductTypeMapper {
    int countByExample(ProductTypeExample example);

    int deleteByExample(ProductTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    List<ProductType> selectByExample(ProductTypeExample example);

    ProductType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByExample(@Param("record") ProductType record, @Param("example") ProductTypeExample example);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);
}
