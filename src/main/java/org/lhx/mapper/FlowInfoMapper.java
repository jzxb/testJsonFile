package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.FlowInfo;
import org.lhx.bean.FlowInfoExample;

public interface FlowInfoMapper {
    long countByExample(FlowInfoExample example);

    int deleteByExample(FlowInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlowInfo record);

    int insertSelective(FlowInfo record);

    List<FlowInfo> selectByExample(FlowInfoExample example);

    int updateByExampleSelective(@Param("record") FlowInfo record, @Param("example") FlowInfoExample example);

    int updateByExample(@Param("record") FlowInfo record, @Param("example") FlowInfoExample example);
}