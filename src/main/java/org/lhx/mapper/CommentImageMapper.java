package org.lhx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.lhx.bean.CommentImage;
import org.lhx.bean.CommentImageExample;

public interface CommentImageMapper {
    long countByExample(CommentImageExample example);

    int deleteByExample(CommentImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommentImage record);

    int insertSelective(CommentImage record);

    List<CommentImage> selectByExample(CommentImageExample example);

    CommentImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommentImage record, @Param("example") CommentImageExample example);

    int updateByExample(@Param("record") CommentImage record, @Param("example") CommentImageExample example);

    int updateByPrimaryKeySelective(CommentImage record);

    int updateByPrimaryKey(CommentImage record);
}