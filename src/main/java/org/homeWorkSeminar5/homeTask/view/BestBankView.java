package org.homeWorkSeminar5.homeTask.view;

import org.homeWorkSeminar5.homeTask.model.User;
import org.homeWorkSeminar5.homeTask.service.BestBankService;
import org.homeWorkSeminar5.homeTask.service.ConsoleTools;

import java.util.Scanner;

public class BestBankView {
    private UserView userView;
    private BestBankService bestBankService;

    public BestBankView() {
        userView = new UserView();
        bestBankService = new BestBankService();
    }

    public void BestBankMenu() {
        int userChoice = -1;
        Scanner scanner = new Scanner(System.in);
        while (userChoice != 0) {
            showMenu();
            userChoice = scanner.nextInt();
            processUserChoice(userChoice);
        }
    }

    private void processUserChoice(int userChoice) {
        if (userView.isAuthorized()) {
            switch (userChoice) {
                case 0 -> bestBankService.saveDataBase();
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> unauthorized();
                case 5 -> deleteUser();
            }
        }else {
            switch (userChoice) {
                case 0 -> bestBankService.saveDataBase();
                case 1 -> addNewUser();
                case 2 -> authorize();
            }
        }
    }

    private void deleteUser() {
        bestBankService.deleteUser(userView.getCurrentUser());
        unauthorized();
    }

    private void unauthorized() {
        userView.unauthorize();
    }

    private void withdraw() {
        int amount = ConsoleTools.AskInt("Введите сумму: ");
        bestBankService.Deposit(userView.getCurrentUser(), amount);
    }

    private void deposit() {
        int amount = ConsoleTools.AskInt("Введите сумму: ");
        bestBankService.Deposit(userView.getCurrentUser(), amount);
    }

    private void authorize() {
        int id = ConsoleTools.AskInt("Введите ID пользователя: ");
        if (bestBankService.UserIdExist(id)) {
            userView.authorize(bestBankService.getUserById(id));
        }else {
            Messages.noUser();
        }
    }

    private void addNewUser() {
        User result = bestBankService.registrationUser();
        if (result != null) {
            System.out.printf("User %s registered\n",result);
            userView.authorize(result);
        } else {
            System.out.println("User NOT registered");
        }
    }

    private void showMenu() {
        System.out.println("0 - выход");
        if (userView.isAuthorized()) {
            System.out.println("1 - проверить баланс");
            System.out.println("2 - внести деньги");
            System.out.println("3 - выдать деньги");
            System.out.println("4 - сменить пользователя");
            System.out.println("5 - удалить пользователя");
        } else {
            System.out.println("1 - новый пользователь");
            System.out.println("2 - авторизация");
        }
        System.out.print("Выберите пункт меню: ");
    }

    private void checkBalance() {
        userView.showBalance();
    }
}
