package ru.simple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.simple.dao.UserMapper;
import ru.simple.pojo.User;
import ru.simple.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) throws Exception{
        return null;
    }

    @Override
    public List<User> findUserByName (String userName) throws Exception {
        return userMapper.findUserByName(userName);
    }
}
