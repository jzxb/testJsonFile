package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.TmClass;
import org.lhx.bean.TmClassExample;

public interface TmClassMapper {
    long countByExample(TmClassExample example);

    int deleteByExample(TmClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TmClass record);

    int insertSelective(TmClass record);

    List<TmClass> selectByExample(TmClassExample example);

    TmClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TmClass record, @Param("example") TmClassExample example);

    int updateByExample(@Param("record") TmClass record, @Param("example") TmClassExample example);

    int updateByPrimaryKeySelective(TmClass record);

    int updateByPrimaryKey(TmClass record);
}