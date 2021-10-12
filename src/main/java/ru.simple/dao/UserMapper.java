package ru.simple.dao;

import ru.simple.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> findUserByName(String s);
}
