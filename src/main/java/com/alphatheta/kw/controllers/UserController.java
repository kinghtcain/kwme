package com.alphatheta.kw.controllers;

import com.alphatheta.kw.entities.User;
import com.alphatheta.kw.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value="/{userId}",method = RequestMethod.GET)
    public User findOne(@PathVariable("userId") String userId){
        User user = userService.find(userId);
        return user;
    }

    @ResponseBody
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<User> getList(){
        List<User> users = userService.findAll();
        return users;
    }
}
