package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.OrderPhase;
import org.lhx.bean.OrderPhaseExample;

public interface OrderPhaseMapper {
    long countByExample(OrderPhaseExample example);

    int deleteByExample(OrderPhaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderPhase record);

    int insertSelective(OrderPhase record);

    List<OrderPhase> selectByExample(OrderPhaseExample example);

    OrderPhase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderPhase record, @Param("example") OrderPhaseExample example);

    int updateByExample(@Param("record") OrderPhase record, @Param("example") OrderPhaseExample example);

    int updateByPrimaryKeySelective(OrderPhase record);

    int updateByPrimaryKey(OrderPhase record);
}