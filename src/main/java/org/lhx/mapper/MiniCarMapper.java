package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.MiniCar;
import org.lhx.bean.MiniCarExample;

public interface MiniCarMapper {
    long countByExample(MiniCarExample example);

    int deleteByExample(MiniCarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniCar record);

    int insertSelective(MiniCar record);

    List<MiniCar> selectByExample(MiniCarExample example);

    int updateByExampleSelective(@Param("record") MiniCar record, @Param("example") MiniCarExample example);

    int updateByExample(@Param("record") MiniCar record, @Param("example") MiniCarExample example);
}