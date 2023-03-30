package org.Seminar1.classTask1.model;

import java.util.AbstractList;

public interface ProductMachine {

    Product getProduct(String name) throws IllegalStateException;

}
