package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.Value;
import org.lhx.bean.ValueExample;

public interface ValueMapper {
    long countByExample(ValueExample example);

    int deleteByExample(ValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Value record);

    int insertSelective(Value record);

    List<Value> selectByExample(ValueExample example);

    Value selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Value record, @Param("example") ValueExample example);

    int updateByExample(@Param("record") Value record, @Param("example") ValueExample example);

    int updateByPrimaryKeySelective(Value record);

    int updateByPrimaryKey(Value record);
}