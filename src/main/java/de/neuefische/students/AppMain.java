package de.neuefische.students;

import de.neuefische.students.model.Student;

public class AppMain {

    public static void main(String[] args) {

        Student student = new Student("Henny Haelbich");
        System.out.println(student.getName());

    }
}

