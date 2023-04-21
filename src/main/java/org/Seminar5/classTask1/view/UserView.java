package org.Seminar5.classTask1.view;

import org.Seminar5.classTask1.controller.UserController;
import org.Seminar5.classTask1.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter ur data");
//        userController.saveNewUser(scanner.nextInt(), scanner.next(), scanner.nextInt());

        User user1 = new User(3, "name", 38);
        userController.addUserRepository(user1);
        System.out.println(userController.getUser(user1));
        userController.deleteFromRepository(user1);
        System.out.println(userController.getUser(user1));
    }
}
