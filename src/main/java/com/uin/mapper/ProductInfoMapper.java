package com.uin.mapper;

import com.uin.pojo.ProductInfo;
import com.uin.pojo.ProductInfoExample;
import com.uin.pojo.vo.ProductInfoVo;
import org.apache.ibatis.annotations.Param;
/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:25 AM
 */
import java.util.List;

public interface ProductInfoMapper {
    int countByExample(ProductInfoExample example);

    int deleteByExample(ProductInfoExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    List<ProductInfo> selectByExample(ProductInfoExample example);

    ProductInfo selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);


    //批量删除商品的功能
    int deleteBatch(String[] ids);

    //多条件查询商品
    List<ProductInfo> selectCondition(ProductInfoVo vo);

}
