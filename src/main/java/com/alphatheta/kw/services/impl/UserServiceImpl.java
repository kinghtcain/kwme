package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.daos.UserDao;
import com.alphatheta.kw.entities.User;
import com.alphatheta.kw.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional(readOnly = true)
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Transactional
    public User find(String id) {
        User user = userDao.find(id);
        return user;
    }

    @Transactional
    public List<User> findAll() {
        List<User> users = userDao.findAll();
        List<User> list = userDao.findAll();
        return users;
    }
}
