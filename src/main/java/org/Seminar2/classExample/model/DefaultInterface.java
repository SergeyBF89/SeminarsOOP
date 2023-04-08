package org.Seminar2.classExample.model;

public interface DefaultInterface {
    void tellAboutYOurself();

    void printBankAcount();
    default void getUserName() {
        System.out.println("default behavior");
    }
}
