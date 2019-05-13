package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.CkInfo;
import org.lhx.bean.CkInfoExample;

public interface CkInfoMapper {
    long countByExample(CkInfoExample example);

    int deleteByExample(CkInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CkInfo record);

    int insertSelective(CkInfo record);

    List<CkInfo> selectByExample(CkInfoExample example);

    CkInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CkInfo record, @Param("example") CkInfoExample example);

    int updateByExample(@Param("record") CkInfo record, @Param("example") CkInfoExample example);

    int updateByPrimaryKeySelective(CkInfo record);

    int updateByPrimaryKey(CkInfo record);
}