package org.homeWorkSeminar5.homeTask.model;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BestBank {
    private List<User> accounts;

    public BestBank() {
        readDataBase();
    }

    public int getSize() {
        return accounts.size();
    }

    public void addUser(User user) {
        accounts.add(user);
    }

    public boolean userIdExist(int id) {
        return id < getSize();
    }

    public User getUserById(int id) {
        return accounts.get(id);
    }

    public void readDataBase() {
        accounts = new ArrayList<>();
        File file = new File("dataBase.txt");
        if (!file.exists()) {
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parameter = line.split(";");
                addUser(new User(Integer.parseInt(parameter[0]),parameter[1],Integer.parseInt(parameter[2])));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void savaDataBase() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("dataBase.txt", false);
            for (User user : accounts) {
                String userString = "" + user.getId() + ";" + user.getBalance() + "\n";
                fileWriter.write(userString);
            }
            fileWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeUser(User user) {
        accounts.remove(user);
    }
}
