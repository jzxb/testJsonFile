package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.RedisLog;
import org.lhx.bean.RedisLogExample;

public interface RedisLogMapper {
    long countByExample(RedisLogExample example);

    int deleteByExample(RedisLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RedisLog record);

    int insertSelective(RedisLog record);

    List<RedisLog> selectByExample(RedisLogExample example);

    int updateByExampleSelective(@Param("record") RedisLog record, @Param("example") RedisLogExample example);

    int updateByExample(@Param("record") RedisLog record, @Param("example") RedisLogExample example);
}