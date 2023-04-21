package org.Seminar5.classTask1.repository;

import org.Seminar5.classTask1.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    private List<User> db = new ArrayList<>();

    public UserRepository(List<User> db) {
        this.db = new ArrayList<>();
    }

    public UserRepository() {

    }

    public void addUserRepository(User user) {
        db.add(user);
    }

    public void deleteFromRepository(User user) {
        db.remove(user);
    }

    public User getUserFromRepository(User user) {
        for (User el : db) {
            if (el.getUserID().equals(user.getUserID())) {
                return el;
            }
        }
        return null;

    }

    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
