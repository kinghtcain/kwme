package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.services.BaseService;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

/**
 * 还没整理好，BaseDao没整理好
 * @param <T>
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    public String save(T t) {
        return null;
    }

    @Override
    public T findById(Integer id) {
        return null;
    }

    @Override
    public T findById(String id) {
        return null;
    }

    @Override
    public T findByProps(String propName, Object propVal) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public List<T> findByQuery(Map<String, Object> params) {
        return null;
    }

    @Override
    public Page<T> find(Integer pageNo, Integer pageSize, String orderBy, String orderWay, Map<String, Object> params) {
        return null;
    }
}
