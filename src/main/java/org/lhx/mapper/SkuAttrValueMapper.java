package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.SkuAttrValue;
import org.lhx.bean.SkuAttrValueExample;

public interface SkuAttrValueMapper {
    long countByExample(SkuAttrValueExample example);

    int deleteByExample(SkuAttrValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkuAttrValue record);

    int insertSelective(SkuAttrValue record);

    List<SkuAttrValue> selectByExample(SkuAttrValueExample example);

    SkuAttrValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkuAttrValue record, @Param("example") SkuAttrValueExample example);

    int updateByExample(@Param("record") SkuAttrValue record, @Param("example") SkuAttrValueExample example);

    int updateByPrimaryKeySelective(SkuAttrValue record);

    int updateByPrimaryKey(SkuAttrValue record);
}