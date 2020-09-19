package com.service;

import com.dao.UserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService, UserDetailsService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImplementation(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addPerson(User user) {
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updatePerson(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    @Transactional
    public List<User> listPersons() {
        return this.userDao.getAllUsers();
    }

    @Override
    @Transactional
    public User findById(int id) {
        return this.userDao.findById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        this.userDao.deleteUser(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
