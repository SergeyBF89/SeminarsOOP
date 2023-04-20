package org.homeWorkseminar4.homeTasks.controller;

import org.homeWorkseminar4.homeTasks.data.User;

public interface UserController <T extends User> {
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
