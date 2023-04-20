package org.homeWorkseminar4.homeTasks.service;

import org.homeWorkseminar4.homeTasks.data.User;

import java.util.List;

public interface UserService <T extends User> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);

    public Long getId(T user);
    public Long getMaxId();

    public default Long getMaxId(List<T> users){
        Long countMaxId = 0L;
        for (T user: users){
            if (getId(user) > countMaxId){
                countMaxId = getId(user);
            }
        }
        return countMaxId;
    }
}
