package org.homeWorkSeminar2.homeTask1.model;

import java.util.Random;
import java.util.Scanner;

public interface ColorUtils {
    static String getRandomColor() {
        int i = new Random().nextInt(6);
        switch (i) {
            case  1 -> {
                return "black";
            }
            case  2 -> {
                return "blue";
            }
            case  3 -> {
                return "yellow";
            }
            case 4 -> {
                return "gold";
            }
            case 5 -> {
                return "silver";
            }
            default -> {
                return "red";
            }
        }
    }

    static String askString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    static Integer askInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
