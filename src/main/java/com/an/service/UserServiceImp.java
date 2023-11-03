package com.an.service;

import com.an.dao.UserDao;
import com.an.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void removeUser(User user) {
        userDao.removeUser(user);
    }

    @Override
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public void removeAllUsers() {
        userDao.removeAllUsers();
    }
}
