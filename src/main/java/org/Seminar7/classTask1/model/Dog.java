package org.Seminar7.classTask1.model;

public class Dog extends Animal{
    private String breed;
    private int hunger;

    public Dog(String breed, int hunger) {
        this.breed = breed;
        this.hunger = hunger;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
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
