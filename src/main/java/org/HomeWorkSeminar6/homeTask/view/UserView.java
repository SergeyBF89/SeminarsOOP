package org.HomeWorkSeminar6.homeTask.view;

import org.HomeWorkSeminar6.homeTask.data.User;

import java.util.List;

public interface UserView <T extends User> {
    void sendOnConsole(List<T> list);
}
