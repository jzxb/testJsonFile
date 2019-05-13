package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.ProductColor;
import org.lhx.bean.ProductColorExample;

public interface ProductColorMapper {
    long countByExample(ProductColorExample example);

    int deleteByExample(ProductColorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductColor record);

    int insertSelective(ProductColor record);

    List<ProductColor> selectByExample(ProductColorExample example);

    ProductColor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductColor record, @Param("example") ProductColorExample example);

    int updateByExample(@Param("record") ProductColor record, @Param("example") ProductColorExample example);

    int updateByPrimaryKeySelective(ProductColor record);

    int updateByPrimaryKey(ProductColor record);
}