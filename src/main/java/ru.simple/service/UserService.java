package ru.simple.service;
import ru.simple.pojo.User;

import java.util.List;

public interface UserService {
    public User findUserById(int id) throws Exception;
    public List<User> findUserByName(String userName) throws Exception;
}
