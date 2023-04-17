package org.Seminar4.classTasks.view;

import org.Seminar4.classTasks.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
