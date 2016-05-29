package com.alphatheta.kw.daos;

import com.alphatheta.kw.entities.LagouJob;
import com.alphatheta.kw.entities.LagouJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LagouJobMapper {
    int countByExample(LagouJobExample example);

    int deleteByExample(LagouJobExample example);

    int deleteByPrimaryKey(String id);

    int insert(LagouJob record);

    int insertSelective(LagouJob record);

    List<LagouJob> selectByExampleWithBLOBs(LagouJobExample example);

    List<LagouJob> selectByExample(LagouJobExample example);

    LagouJob selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LagouJob record, @Param("example") LagouJobExample example);

    int updateByExampleWithBLOBs(@Param("record") LagouJob record, @Param("example") LagouJobExample example);

    int updateByExample(@Param("record") LagouJob record, @Param("example") LagouJobExample example);

    int updateByPrimaryKeySelective(LagouJob record);

    int updateByPrimaryKeyWithBLOBs(LagouJob record);

    int updateByPrimaryKey(LagouJob record);
}