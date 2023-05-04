package org.Seminar7.classTask1.model;

public class Cat extends Animal{
    private boolean isInGoodMood;
    private int hunger;

    public Cat(boolean isInGoodMood, int hunger) {
        this.isInGoodMood = isInGoodMood;
        this.hunger = hunger;
    }

    public boolean isInGoodMood() {
        return isInGoodMood;
    }

    public void setInGoodMood(boolean inGoodMood) {
        isInGoodMood = inGoodMood;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isInGoodMood=" + isInGoodMood +
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
