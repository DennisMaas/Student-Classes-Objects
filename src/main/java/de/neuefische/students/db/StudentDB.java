package de.neuefische.students.db;

import de.neuefische.students.model.Student;

import java.util.Arrays;

public class StudentDB {
    Student[] studentArray;

    public StudentDB (Student[] studentArray){
        this.studentArray = studentArray;
    }

    public Student[] list() {
        return studentArray;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }

}