package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.Attrbute;
import org.lhx.bean.AttrbuteExample;

public interface AttrbuteMapper {
    long countByExample(AttrbuteExample example);

    int deleteByExample(AttrbuteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Attrbute record);

    int insertSelective(Attrbute record);

    List<Attrbute> selectByExample(AttrbuteExample example);

    Attrbute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Attrbute record, @Param("example") AttrbuteExample example);

    int updateByExample(@Param("record") Attrbute record, @Param("example") AttrbuteExample example);

    int updateByPrimaryKeySelective(Attrbute record);

    int updateByPrimaryKey(Attrbute record);
}