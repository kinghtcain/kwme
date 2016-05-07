package com.alphatheta.kw.daos;

import java.util.List;

public interface BaseDao<T> {

    //T find(Integer id);
    T find(String idStr);
    List<T> findAll();
}
