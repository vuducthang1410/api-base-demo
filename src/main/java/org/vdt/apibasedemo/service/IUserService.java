package org.vdt.apibasedemo.service;

import org.vdt.apibasedemo.dto.User;

import java.util.List;

public interface IUserService {
    User findUserById(int id);
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(int id);
    List<User> findAllUsers();
}
