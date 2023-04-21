package org.Seminar5.classTask1.controller;

import org.Seminar5.classTask1.model.User;
import org.Seminar5.classTask1.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(Integer userID, String name, int age) {
        userService.saveUser(new User(userID, name, age));
    }
    public void deleteFromRepository(User user) {
        userService.deleteFromRepository(user);
    }

    public User getUser(User user) {
        return userService.getUserFromRepository(user);
    }

    public void addUserRepository(User user) {
        userService.addUserRepository(user);
    }
}
