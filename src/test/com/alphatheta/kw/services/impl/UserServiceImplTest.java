package com.alphatheta.kw.services.impl;

import com.alphatheta.kw.entities.User;
import com.alphatheta.kw.services.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations ={"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class UserServiceImplTest extends TestCase {

    @Autowired
    private UserService userService;

    @Test
    public void testFind() throws Exception {
        User user = userService.find("12");
        System.out.println(user);
    }

    @Test
    public void testFindAll() throws Exception {
        List<User> users = userService.findAll();
        for (User user :users){
            System.out.println(user.getUserId());
            System.out.println(user.getUserName());
        }

    }
}