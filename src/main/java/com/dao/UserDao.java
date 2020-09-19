package com.dao;

import com.domain.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    List<User> getAllUsers();
    User findById(int id);
    void deleteUser(int id);
}
