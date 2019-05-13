package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.PauFlowInfoLog;
import org.lhx.bean.PauFlowInfoLogExample;

public interface PauFlowInfoLogMapper {
    long countByExample(PauFlowInfoLogExample example);

    int deleteByExample(PauFlowInfoLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PauFlowInfoLog record);

    int insertSelective(PauFlowInfoLog record);

    List<PauFlowInfoLog> selectByExample(PauFlowInfoLogExample example);

    int updateByExampleSelective(@Param("record") PauFlowInfoLog record, @Param("example") PauFlowInfoLogExample example);

    int updateByExample(@Param("record") PauFlowInfoLog record, @Param("example") PauFlowInfoLogExample example);
}