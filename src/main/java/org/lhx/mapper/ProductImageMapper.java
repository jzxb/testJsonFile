package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.ProductImage;
import org.lhx.bean.ProductImageExample;

public interface ProductImageMapper {
    long countByExample(ProductImageExample example);

    int deleteByExample(ProductImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductImage record);

    int insertSelective(ProductImage record);

    List<ProductImage> selectByExample(ProductImageExample example);

    ProductImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductImage record, @Param("example") ProductImageExample example);

    int updateByExample(@Param("record") ProductImage record, @Param("example") ProductImageExample example);

    int updateByPrimaryKeySelective(ProductImage record);

    int updateByPrimaryKey(ProductImage record);
}