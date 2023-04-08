package org.homeWorkSeminar2.homeTask1.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DataBase implements Iterable{
    static int index;

    private Laptop iteratorBase[];
    private HashSet<Laptop> laptops;

    public DataBase() {
        laptops = new LinkedHashSet<>();
        index = 0;
    }

    private DataBase(DataBase data) {
        laptops = new LinkedHashSet<>(data.laptops);
        index = laptops.size() - 1;
    }

    public static Laptop creatRandomLaptop() {
        Random random = new Random();
        int ramSize = (int) Math.pow(2, (1 + random.nextInt(6)));
        int diskSize = 1 + random.nextInt(4);
        String os = (random.nextInt(2) == 0 ? "windows" : "Mac OS");
        String color = ColorUtils.getRandomColor();
        Laptop note = new Laptop("model_" + (index + 1), ramSize, diskSize, os, color);
        return note;
    }

    public void remove(Laptop item) {
        if (laptops.contains(item)) {
            laptops.remove(item);
            index = laptops.size() - 1;
        }
    }

    public DataBase unloadBase() {
        return new DataBase(this);
    }

    public int size() {
        return index + 1;
    }

    public String getOptionValueString(OptionType key) {
        Set resultSet = new TreeSet();
        for (Laptop item : laptops) {
            resultSet.add(item.getOption(key));
        }


        String result = "";
        for (Object o : resultSet) {
            result += (result.isEmpty() ? "" : ", ") + o.toString();
        }
        return result;
    }

    public void printBase() {
        for (Laptop item : laptops) {
            System.out.println(item);
        }
    }

    public void addNew(Laptop newNote) {
        laptops.add(newNote);
        index = laptops.size() - 1;
    }

    public void empty() {
        laptops.clear();
        index = 0;
    }

    @Override
    public Iterator iterator() {
        return laptops.iterator();
    }
}
