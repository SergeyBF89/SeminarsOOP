package org.homeWorkSeminar5.homeTask.service;

import java.util.Scanner;

public class ConsoleTools {
    public static String AskString(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int AskInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
