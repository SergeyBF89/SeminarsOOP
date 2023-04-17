package org.Seminar4.classTasks;

import org.Seminar4.classTasks.data.Student;
import org.Seminar4.classTasks.data.Teacher;
import org.Seminar4.classTasks.data.User;
import org.Seminar4.classTasks.data.UserComparator;
import org.Seminar4.classTasks.view.StudentView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacher1", "teacher1", "teacher1", "date1");
        Teacher teacher2 = new Teacher("teacher1", "teacher1", "teacher1", "date1");
        UserComparator<Teacher> comparator = new UserComparator<>();
        System.out.println(comparator.compare(teacher1, teacher2));





    }
}
