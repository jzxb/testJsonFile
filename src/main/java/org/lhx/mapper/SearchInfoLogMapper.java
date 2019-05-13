package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.SearchInfoLog;
import org.lhx.bean.SearchInfoLogExample;

public interface SearchInfoLogMapper {
    long countByExample(SearchInfoLogExample example);

    int deleteByExample(SearchInfoLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SearchInfoLog record);

    int insertSelective(SearchInfoLog record);

    List<SearchInfoLog> selectByExample(SearchInfoLogExample example);

    int updateByExampleSelective(@Param("record") SearchInfoLog record, @Param("example") SearchInfoLogExample example);

    int updateByExample(@Param("record") SearchInfoLog record, @Param("example") SearchInfoLogExample example);
}