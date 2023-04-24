package org.Seminar5.classTask1.model;

public class User {
    private Integer userID;
    private String name;
    private int age;

    public User(Integer userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
