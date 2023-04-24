package org.homeWorkSeminar5.homeTask.service;

import org.homeWorkSeminar5.homeTask.model.BestBank;
import org.homeWorkSeminar5.homeTask.model.User;
import org.homeWorkSeminar5.homeTask.view.Messages;


public class BestBankService {
    private BestBank bestBank;
    private UserService userService;

    public BestBankService() {
        bestBank = new BestBank();
        userService = new UserService();
    }

    public void saveDataBase() {
        bestBank.savaDataBase();
    }

    public boolean UserIdExist(int id) {
        return bestBank.userIdExist(id);
    }

    public User getUserById(int id){
        if (UserIdExist(id)){
            return bestBank.getUserById(id);
        }
        return null;
    }

    public int getNewId() {
        return bestBank.getSize();
    }

    public User addUser(String name) {
        User newUser = userService.createUser(bestBank.getSize(), name);
        bestBank.addUser(newUser);
        return newUser;
    }

    public User registrationUser() {
        String newUserName = ConsoleTools.AskString("Введите имя пользователя: ");
        if (newUserName.isEmpty()) {
            Messages.wrongName("Имя не может быть пустым");
            return null;
        } else if (newUserName.contains(";")) {
            Messages.wrongName("Имя не может содержать ';'");
            return null;
        }
        return addUser(newUserName);
    }

    public int getBalance(User user) {
        return user.getBalance();
    }

    public void Deposit(User user, int amount) {
        userService.changeBalance(user, amount);
    }

    public void Exclude(User user, int amount) {
        if (getBalance(user) < amount) {
            Messages.SayNoMoney();
        }else {
            userService.changeBalance(user, -amount);
        }
    }

    public void deleteUser(User user) {
        bestBank.removeUser(user);
    }
}
