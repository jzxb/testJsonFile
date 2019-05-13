package org.lhx.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.lhx.bean.ClassOne;
import org.lhx.bean.ClassOneExample;

public interface ClassOneMapper {
    long countByExample(ClassOneExample example);

    int deleteByExample(ClassOneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassOne record);

    int insertSelective(ClassOne record);

    Map getMap();

    List<ClassOne> selectList();

    List<ClassOne> selectByExample(ClassOneExample example);

    ClassOne selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassOne record, @Param("example") ClassOneExample example);

    int updateByExample(@Param("record") ClassOne record, @Param("example") ClassOneExample example);

    int updateByPrimaryKeySelective(ClassOne record);

    int updateByPrimaryKey(ClassOne record);
}