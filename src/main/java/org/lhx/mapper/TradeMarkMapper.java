package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.TradeMark;
import org.lhx.bean.TradeMarkExample;

public interface TradeMarkMapper {
    long countByExample(TradeMarkExample example);

    int deleteByExample(TradeMarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TradeMark record);

    int insertSelective(TradeMark record);

    List<TradeMark> selectByExample(TradeMarkExample example);

    TradeMark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TradeMark record, @Param("example") TradeMarkExample example);

    int updateByExample(@Param("record") TradeMark record, @Param("example") TradeMarkExample example);

    int updateByPrimaryKeySelective(TradeMark record);

    int updateByPrimaryKey(TradeMark record);
}