package org.Seminar5.classTask2.model.models;

import java.time.LocalDate;

public class Contact implements Comparable<Contact> {
    public String firstName;
    public String lastName;
    public String company;
    public String phone;
    public String description;

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        Contact contact = (Contact) obj;
        return this.firstName == contact.firstName && this.lastName == contact.lastName;
    }

    @Override
    public int compareTo(Contact o) {
        return 0;
    }
}
