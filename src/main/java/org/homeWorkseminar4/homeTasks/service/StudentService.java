package org.homeWorkseminar4.homeTasks.service;

import org.homeWorkseminar4.homeTasks.data.Student;

import java.util.ArrayList;
import java.util.List;

<<<<<<<< HEAD:src/main/java/org/homeWorkseminar4/homeTasks/service/StudentService.java
public class StudentService implements UserService<Student> {
    private final List<Student> students;
========
public class StudentService implements UserService<org.homeWorkseminar4.homeTasks.data.Student> {

    private final List<org.homeWorkseminar4.homeTasks.data.Student> students;
>>>>>>>> origin/main:src/main/java/org/Seminar4/classTasks/service/StudentService.java

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<org.homeWorkseminar4.homeTasks.data.Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
//        Long countMaxId = 0L;
//        for (Student student: students){
//                if (student.getStudentId() > countMaxId){
//                    countMaxId = student.getStudentId();
//            }
//        }
        Long countMaxId = getMaxId();
        countMaxId++;
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        students.add(student);
    }

    @Override
<<<<<<<< HEAD:src/main/java/org/homeWorkseminar4/homeTasks/service/StudentService.java
    public Long getId(Student student) {
        return student.getStudentId();
    }

    @Override
    public Long getMaxId() {
        return getMaxId(students);
========
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
>>>>>>>> origin/main:src/main/java/org/Seminar4/classTasks/service/StudentService.java
    }
}
