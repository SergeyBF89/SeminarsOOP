package org.Seminar1.classCat.model;

public class Cat extends CatMover implements CatInterface{
    private String name;
    private int age;

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

    public void say() {
        System.out.println(name);
    }

    @Override
    public void saySomething() {
        System.out.println("meow");
    }

    @Override
    public void sayWithInterface() {
        System.out.println("meow with interface");
    }
}
