package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.UserPay;
import org.lhx.bean.UserPayExample;

public interface UserPayMapper {
    long countByExample(UserPayExample example);

    int deleteByExample(UserPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPay record);

    int insertSelective(UserPay record);

    List<UserPay> selectByExample(UserPayExample example);

    UserPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPay record, @Param("example") UserPayExample example);

    int updateByExample(@Param("record") UserPay record, @Param("example") UserPayExample example);

    int updateByPrimaryKeySelective(UserPay record);

    int updateByPrimaryKey(UserPay record);
}