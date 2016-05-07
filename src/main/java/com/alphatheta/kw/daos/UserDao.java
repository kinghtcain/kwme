package com.alphatheta.kw.daos;

import com.alphatheta.kw.entities.User;

import java.util.List;

public interface UserDao {

    User find(String id);
    List<User> findAll();
}
