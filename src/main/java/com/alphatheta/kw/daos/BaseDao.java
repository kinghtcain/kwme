package com.alphatheta.kw.daos;

import com.alphatheta.kw.entities.LagouJob;
import com.alphatheta.kw.entities.LagouJobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 还没整理好
 * @param <T>
 */
public interface BaseDao<T> {
    int countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExampleWithBLOBs(T example);

    List<T> selectByExample(T example);
}
