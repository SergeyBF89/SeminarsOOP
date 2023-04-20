package org.homeWorkseminar4.homeTasks.view;

import org.homeWorkseminar4.homeTasks.data.Student;
import org.homeWorkseminar4.homeTasks.data.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}



