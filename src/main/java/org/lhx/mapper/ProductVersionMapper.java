package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.ProductVersion;
import org.lhx.bean.ProductVersionExample;

public interface ProductVersionMapper {
    long countByExample(ProductVersionExample example);

    int deleteByExample(ProductVersionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductVersion record);

    int insertSelective(ProductVersion record);

    List<ProductVersion> selectByExample(ProductVersionExample example);

    ProductVersion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductVersion record, @Param("example") ProductVersionExample example);

    int updateByExample(@Param("record") ProductVersion record, @Param("example") ProductVersionExample example);

    int updateByPrimaryKeySelective(ProductVersion record);

    int updateByPrimaryKey(ProductVersion record);
}