package com.alphatheta.kw.daos;

import com.alphatheta.kw.entities.LagouJobSimilarLinks;
import com.alphatheta.kw.entities.LagouJobSimilarLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LagouJobSimilarLinksMapper {
    int countByExample(LagouJobSimilarLinksExample example);

    int deleteByExample(LagouJobSimilarLinksExample example);

    int insert(LagouJobSimilarLinks record);

    int insertSelective(LagouJobSimilarLinks record);

    List<LagouJobSimilarLinks> selectByExampleWithBLOBs(LagouJobSimilarLinksExample example);

    List<LagouJobSimilarLinks> selectByExample(LagouJobSimilarLinksExample example);

    int updateByExampleSelective(@Param("record") LagouJobSimilarLinks record, @Param("example") LagouJobSimilarLinksExample example);

    int updateByExampleWithBLOBs(@Param("record") LagouJobSimilarLinks record, @Param("example") LagouJobSimilarLinksExample example);

    int updateByExample(@Param("record") LagouJobSimilarLinks record, @Param("example") LagouJobSimilarLinksExample example);
}