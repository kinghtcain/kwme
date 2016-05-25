package com.alphatheta.kw.daos;

import com.alphatheta.kw.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    User find(String id);
    List<User> findAll();
}
