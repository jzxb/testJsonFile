package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.ClassOne;
import org.lhx.bean.ClassTwo;
import org.lhx.bean.ClassTwoExample;

public interface ClassTwoMapper {
    long countByExample(ClassTwoExample example);

    int deleteByExample(ClassTwoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassTwo record);

    int insertSelective(ClassTwo record);

    List<ClassTwo> selectList();

    List<ClassTwo> selectByExample(ClassTwoExample example);

    ClassTwo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassTwo record, @Param("example") ClassTwoExample example);

    int updateByExample(@Param("record") ClassTwo record, @Param("example") ClassTwoExample example);

    int updateByPrimaryKeySelective(ClassTwo record);

    int updateByPrimaryKey(ClassTwo record);
}