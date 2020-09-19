package com.service;

import com.domain.User;

import java.util.List;

 public interface UserService {
     void addPerson(User user);
     void updatePerson(User user);
     List<User> listPersons();
     User findById(int id);
     void removePerson(int id);
}
