package org.Seminar4.classTasks.service;

import org.Seminar4.classTasks.data.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {

    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        Long countMaxId = 0L;
        for (Student student: students){
                if (student.getStudentId() > countMaxId){
                    countMaxId = student.getStudentId();
            }
        }
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, Math.toIntExact(countMaxId));
        students.add(student);
    }
}
