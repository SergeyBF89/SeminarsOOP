package org.Seminar4.classTasks.service;

import org.Seminar4.classTasks.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<org.homeWorkseminar4.homeTasks.data.Student> {

    private final List<org.homeWorkseminar4.homeTasks.data.Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<org.homeWorkseminar4.homeTasks.data.Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {

    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (org.homeWorkseminar4.homeTasks.data.Student student: students){
                if (student.getStudentId() > countMaxId){
                    countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        org.homeWorkseminar4.homeTasks.data.Student student = new Student(firstName, secondName, patronymic, dateOfBirth, Math.toIntExact(countMaxId));
        students.add(student);
    }
}
