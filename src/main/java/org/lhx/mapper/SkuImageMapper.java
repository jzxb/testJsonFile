package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.SkuImage;
import org.lhx.bean.SkuImageExample;

public interface SkuImageMapper {
    long countByExample(SkuImageExample example);

    int deleteByExample(SkuImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkuImage record);

    int insertSelective(SkuImage record);

    List<SkuImage> selectByExample(SkuImageExample example);

    SkuImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkuImage record, @Param("example") SkuImageExample example);

    int updateByExample(@Param("record") SkuImage record, @Param("example") SkuImageExample example);

    int updateByPrimaryKeySelective(SkuImage record);

    int updateByPrimaryKey(SkuImage record);
}