package com.an.dao;

import com.an.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUser(User user);

    void removeUser(User user);

    void removeUserById(long id);

    void removeAllUsers();
}
