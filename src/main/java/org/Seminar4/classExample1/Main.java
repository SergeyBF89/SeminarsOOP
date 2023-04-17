package org.Seminar4.classExample1;

import org.Seminar4.classExample1.model.Animal;
import org.Seminar4.classExample1.model.Cat;
import org.Seminar4.classExample1.model.Dog;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal<Cat> catAnimal = new Animal<>();
        Animal<Dog> dogAnimal = new Animal<>();
        catAnimal.setAnimal(new Cat("barsik"));
        dogAnimal.setAnimal(new Dog("bobik", 3, 10));
        System.out.println(catAnimal.getInfoAboutAnimal());
        System.out.println(dogAnimal.getInfoAboutAnimal());

    }
}
