package org.Seminar3.classTask1.model;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return -o1.getWeight().compareTo(o2.getWeight());
    }
}
