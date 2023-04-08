package org.Seminar2.classTask1.model;

public abstract class Buyer implements BuyerBehavior{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public boolean isMakeOrder() {
        return makeOrder;
    }

    public boolean isTakeOrder() {
       return takeOrder;
    }
    public abstract String getName();
}
