package org.homeWorkseminar4.homeTasks.data;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> students;

    void publicStudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }

    public StudentGroupIterator(StudentGroup students, List<Student> students1) {

        this.students = students1;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}
