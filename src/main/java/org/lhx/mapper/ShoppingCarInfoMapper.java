package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.ShoppingCarInfo;
import org.lhx.bean.ShoppingCarInfoExample;

public interface ShoppingCarInfoMapper {
    long countByExample(ShoppingCarInfoExample example);

    int deleteByExample(ShoppingCarInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCarInfo record);

    int insertSelective(ShoppingCarInfo record);

    List<ShoppingCarInfo> selectByExample(ShoppingCarInfoExample example);

    ShoppingCarInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShoppingCarInfo record, @Param("example") ShoppingCarInfoExample example);

    int updateByExample(@Param("record") ShoppingCarInfo record, @Param("example") ShoppingCarInfoExample example);

    int updateByPrimaryKeySelective(ShoppingCarInfo record);

    int updateByPrimaryKey(ShoppingCarInfo record);
}