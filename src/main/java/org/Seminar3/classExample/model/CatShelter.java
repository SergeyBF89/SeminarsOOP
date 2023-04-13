package org.Seminar3.classExample.model;

import java.util.Iterator;
import java.util.List;

public class CatShelter implements Iterable<Cat>{
    private List<Cat> cats;
    public CatShelter(List<Cat> cats) {
        this.cats = cats;
    }

    public void getSize() {
        System.out.println(cats.size());
    }

    @Override
    public Iterator<Cat> iterator() {
        return new CatIterator(cats);
    }
}
