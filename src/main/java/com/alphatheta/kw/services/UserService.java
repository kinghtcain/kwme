package com.alphatheta.kw.services;

import com.alphatheta.kw.entities.User;

import java.util.List;

public interface UserService {

    User find(String id);
    List<User> findAll();
}
