package top.msse.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.msse.entity.Blog;
import top.msse.entity.BlogExample;

public interface BlogMapper {
    long countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogExample example);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);
}