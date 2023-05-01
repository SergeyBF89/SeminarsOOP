package org.Seminar6.classTask3.model;

import java.math.BigDecimal;

public class NewClass extends Account {
    @Override
    protected void deposit(float amount) {
        this.balance += amount;
    }

    @Override
    protected void withdraw(float amount) {
        this.balance -= amount;
    }
}
