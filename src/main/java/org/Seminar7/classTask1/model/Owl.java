package org.Seminar7.classTask1.model;

public class Owl extends Animal{
    private boolean isDomesticated;
    private int hunger;

    public Owl(boolean isDomesticated, int hunger) {
        this.isDomesticated = isDomesticated;
        this.hunger = hunger;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Owl{" +
                "isDomesticated=" + isDomesticated +
                ", hunger=" + hunger + name + age +
                '}';
    }

    @Override
    public void voice() {

    }

    @Override
    public void feed(int hunger) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAge(int age) {

    }
}
