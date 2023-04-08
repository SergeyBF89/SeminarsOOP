package org.homeWorkSeminar2.homeTask1.model;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class UserFilter {
    private boolean userHere;
    private Laptop filter;
    private DataBase base;
    private DataBase filterBase;
    private LinkedHashMap<Integer, String> optionList;


    public UserFilter(DataBase base) {
        userHere = base.size() > 0;
        this.base = base.unloadBase();
        this.filter = new Laptop();
        System.out.printf("We have %d laptops!\n",this.base.size());
    }

    private void printOptions() {
        System.out.println("0 - Exit");
        for (OptionType option : OptionType.values()) {
            String str = String.format("%d - %s %s", option.number(), option, filter.getOption(option));
            System.out.println(str);
        }
    }

    public void askFilter() {
        printOptions();
        System.out.print("Option: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        if (userChoice == 0) this.userHere = false;
        else if (userChoice > OptionType.values().length) System.out.println("Wrong option");
        else {
            askOption(userChoice);
            runFilter();
            printFilter();
        }
    }

    private void runFilter() {
        filterBase = base.unloadBase();
        for (OptionType option : OptionType.values()) {
            filterByOption(option);
        }
    }

    private void filterByOption(OptionType option) {
        Laptop item;
        LaptopComparator comp = new LaptopComparator(option);
        for (Object temp : base) {
            item = (Laptop) temp;

            if (comp.compare(item, filter) < 0) {
                filterBase.remove(item);
            }
        }
    }

    private void printFilter() {
        for (Object temp : filterBase) {
            System.out.println((Laptop) temp);
        }
    }

    private void askOption(int userChoice) {
        OptionType option = OptionType.getByNumber(userChoice);
        String variants = base.getOptionValueString(option);
        Object value;
        System.out.print(option + " (" + variants + ") :");
        if (option.isNumber()) {
            value = ColorUtils.askInt();
        } else {
            value = ColorUtils.askString();
        }
        filter.setOption(option, value);
    }

    public boolean isUserHere() {
        return userHere;
    }
}
