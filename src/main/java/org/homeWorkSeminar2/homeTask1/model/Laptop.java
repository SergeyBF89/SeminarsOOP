package org.homeWorkSeminar2.homeTask1.model;

import java.util.HashMap;

public class Laptop {
    public LaptopComparator getOption;
    private HashMap<OptionType, Object> optionList;

    public Laptop(String model, Integer ramSize, Integer hddDiskSize, String osName, String color) {
        optionList = new HashMap<>();
        setOption(OptionType.MODEL, model);
        setOption(OptionType.RAM, ramSize);
        setOption(OptionType.HDDDISKSIZE, hddDiskSize);
        setOption(OptionType.OS, osName);
        setOption(OptionType.COLOR, color);
    }

    public Laptop() {
        this("", 0, 0, "", "");
    }

    public void setOption(OptionType option, Object value) {
        optionList.put(option, value);
    }

    public Object getOption(OptionType option) {
        return optionList.get(option);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        Laptop second = (Laptop) obj;
        for (OptionType option : OptionType.values()) {
            if (!this.optionList.get(option).equals(second.optionList.get(option))) {
                return false;
            }
        }
        return true;
    }


    public String toString() {
        String result = "";
        for (OptionType option : OptionType.values()) {
            result += option.toString() + ": " + getOption(option) + "\t\t";
        }
        return result;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }
}
