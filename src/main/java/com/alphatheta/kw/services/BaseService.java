package com.alphatheta.kw.services;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

/**
 * 还没有实现
 * @param <T>
 */
public interface BaseService<T> {

    String save(T t);
    T findById(Integer id);
    T findById(String id);
    T findByProps(String propName,Object propVal);
    List<T> findAll();
    List<T> findByQuery(Map<String,Object> params);
    Page<T> find(Integer pageNo,Integer pageSize,String orderBy,String orderWay,Map<String,Object> params);
}
