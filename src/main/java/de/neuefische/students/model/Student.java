package de.neuefische.students.model;

import java.util.Objects;

public class Student {

    private String name;
    private int studentID = 6795678;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID);
    }

    public Student(String name, int studentID){
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
