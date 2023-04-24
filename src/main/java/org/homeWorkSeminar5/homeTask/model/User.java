package org.homeWorkSeminar5.homeTask.model;

public class User {
    private int id;
    private int balance;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public User(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("id: %d name: %s",id, name);
    }

    public void changeBalance(int amount) {
        this.balance += amount;
    }

    public void showBalance() {
        System.out.printf("User: %d %s balance: %s\n", id, name, balance);
    }
}
