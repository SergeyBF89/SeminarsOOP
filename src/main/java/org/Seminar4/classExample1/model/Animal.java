package org.Seminar4.classExample1.model;

import java.util.List;

public class Animal <T extends BasicAnimal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getInfoAboutAnimal() {
        return animal;
    }
}
