package org.homeWorkSeminar2.homeTask1.model;

import java.util.Comparator;

public class LaptopComparator implements Comparator<Laptop> {
    private OptionType option;

    public LaptopComparator(OptionType optionName) {
        this.option = optionName;
    }

    @Override
    public int compare(Laptop o1, Laptop o2) {
        Object value1 = o1.getOption(option);
        Object value2 = o2.getOption(option);
        if (option.isNumber()) {
            return (Integer) value1 - (Integer) value2;
        }
        if (value1.equals(value2)) {
            return  0;
        }
        if (((String) value1).contains((String) value2)) {
            return 1;
        }
        return -1;
    }

}
