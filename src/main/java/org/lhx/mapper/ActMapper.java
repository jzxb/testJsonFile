package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.Act;
import org.lhx.bean.ActExample;

public interface ActMapper {
    long countByExample(ActExample example);

    int deleteByExample(ActExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Act record);

    int insertSelective(Act record);

    List<Act> selectByExample(ActExample example);

    int updateByExampleSelective(@Param("record") Act record, @Param("example") ActExample example);

    int updateByExample(@Param("record") Act record, @Param("example") ActExample example);
}