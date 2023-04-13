package org.Seminar3.classTask1;

import org.Seminar3.classTask1.model.Animal;
import org.Seminar3.classTask1.model.AnimalComparator;
import org.Seminar3.classTask1.model.Cat;
import org.Seminar3.classTask1.model.CatShelter;
import org.Seminar3.classTask1.model.Dog;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                shelter.addAnimal(new Cat(i * 2,i * 3,"cat" + i));
            }
            else {
                shelter.addAnimal(new Dog(i * 3,i * 4,"dog" + i));
            }
        }
        shelter.print();
        shelter.sort(new AnimalComparator());
        System.out.println("-----------");
        shelter.print();
    }
}
