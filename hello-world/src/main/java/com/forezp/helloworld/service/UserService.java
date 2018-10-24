package com.forezp.helloworld.service;

import com.forezp.helloworld.dao.UserDao;
import com.forezp.helloworld.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public long saveUser(User user) {
        user = userDao.save(user);
        return user.getId();
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

}
