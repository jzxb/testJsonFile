package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.UserDoLog;
import org.lhx.bean.UserDoLogExample;

public interface UserDoLogMapper {
    long countByExample(UserDoLogExample example);

    int deleteByExample(UserDoLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDoLog record);

    int insertSelective(UserDoLog record);

    List<UserDoLog> selectByExample(UserDoLogExample example);

    int updateByExampleSelective(@Param("record") UserDoLog record, @Param("example") UserDoLogExample example);

    int updateByExample(@Param("record") UserDoLog record, @Param("example") UserDoLogExample example);
}