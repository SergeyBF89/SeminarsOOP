package org.Seminar5.classTask1.service;

import org.Seminar5.classTask1.model.User;
import org.Seminar5.classTask1.repository.UserRepository;

public class UserService {
    private UserRepository userRepository = new UserRepository();
    public void saveUser(User user) {
        userRepository.saveUser(user);
    }

    public void deleteFromRepository(User user) {
        userRepository.deleteFromRepository(user);
    }

    public User getUserFromRepository(User user) {
        return userRepository.getUserFromRepository(user);
    }

    public void addUserRepository(User user) {
        userRepository.addUserRepository(user);
    }
}
