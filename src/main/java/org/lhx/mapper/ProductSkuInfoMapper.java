package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.ProductSkuInfo;
import org.lhx.bean.ProductSkuInfoExample;
import org.lhx.bean.ProductSkuInfoKey;

public interface ProductSkuInfoMapper {
    long countByExample(ProductSkuInfoExample example);

    int deleteByExample(ProductSkuInfoExample example);

    int deleteByPrimaryKey(ProductSkuInfoKey key);

    int insert(ProductSkuInfo record);

    int insertSelective(ProductSkuInfo record);

    List<ProductSkuInfo> selectByExample(ProductSkuInfoExample example);

    ProductSkuInfo selectByPrimaryKey(ProductSkuInfoKey key);

    int updateByExampleSelective(@Param("record") ProductSkuInfo record, @Param("example") ProductSkuInfoExample example);

    int updateByExample(@Param("record") ProductSkuInfo record, @Param("example") ProductSkuInfoExample example);

    int updateByPrimaryKeySelective(ProductSkuInfo record);

    int updateByPrimaryKey(ProductSkuInfo record);
}