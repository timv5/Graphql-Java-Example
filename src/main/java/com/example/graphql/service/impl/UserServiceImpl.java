package com.example.graphql.service.impl;

import com.example.graphql.model.Users;
import com.example.graphql.repository.UserDao;
import com.example.graphql.service.dao.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Users getUser(final String id) {
        Users users = new Users();
        try {
            users = this.userDao.getOne(Long.valueOf(id));
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        return users;
    }
}
