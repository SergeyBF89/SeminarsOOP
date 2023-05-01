package org.HomeWorkSeminar6.homeTask.service;

import org.HomeWorkSeminar6.homeTask.data.Student;
import org.HomeWorkSeminar6.homeTask.data.StudentGroup;
import org.HomeWorkSeminar6.homeTask.data.Teacher;
import org.HomeWorkSeminar6.homeTask.data.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = studentGroup.iterator();
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("������� � ������ %s � �������� %s �� ������", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("������� ����� ������ �������� � ���������� ������ � ��������");
        }
        return result.get(0);
    }

    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<>());
        return students;
    }
}
