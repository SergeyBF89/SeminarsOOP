package org.homeWorkseminar4.homeTasks.data;

public class Student extends User implements Comparable<Student> {
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, String dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Student(String firstName, String secondName, String patronymic, String dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.id = studentId;
    }

    public Long getStudentId() {
        return id;
    }

    public void setStudentId(Long studentId) {
        this.id = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + id +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
