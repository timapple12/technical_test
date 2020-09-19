package com.dao;

import com.domain.User;
import lombok.extern.java.Log;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Log
@Repository
public class UserDaoImplementation implements UserDao {

    private final SessionFactory factory;

    @Autowired
    public UserDaoImplementation(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public void addUser(User user) {
        Session session = this.factory.getCurrentSession();
        session.save(user);
        log.info("User saved");
    }

    @Override
    public void updateUser(User user) {
        Session session = this.factory.getCurrentSession();
        session.update(user);
        log.info("User updated");
    }

    @Override
    public List<User> getAllUsers() {
        Session session = this.factory.getCurrentSession();
        List<User> userList = session.createQuery("from User").list();
        for(User user : userList){
            log.info("User List::"+user);
        }
        return userList;
    }

    @Override
    public User findById(int id) {
        Session session = this.factory.getCurrentSession();
        User user = session.load(User.class, id);
        log.info("User loaded, Person details="+user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        Session session = this.factory.getCurrentSession();
        User user = session.load(User.class, id);
        if(user != null){
            session.delete(user);
        }
        log.info("Person deleted");
    }
}
