package org.homeWorkSeminar5.homeTask.service;

import org.homeWorkSeminar5.homeTask.model.User;
import org.homeWorkSeminar5.homeTask.view.Messages;

public class UserService {
    public User createUser(int id, String name) {
        return new User(id, name);
    }

    public void changeBalance(User user, int amount) {
        user.changeBalance(amount);
        Messages.ShowOperation(amount);
    }
}
