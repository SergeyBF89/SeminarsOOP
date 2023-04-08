package org.Seminar2.classExample.model;

import org.Seminar2.classExample.model.DefaultInterface;

public class User implements DefaultInterface {
    @Override
    public void tellAboutYOurself() {

    }

    @Override
    public void printBankAcount() {
        System.out.println("589254829");
    }

    @Override
    public void getUserName() {
        System.out.println("someName");
    }
}
