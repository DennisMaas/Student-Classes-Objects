package de.neuefische.students;

import de.neuefische.students.db.StudentDB;
import de.neuefische.students.model.*;

public class AppMain {

    public static void main(String[] args) {

        Student student0 = new StudentHistory("Henny", 111);
        Student student1 = new StudentHistory("Elisabeth", 222);
        Student student2 = new StudentComputerScience("Jakob", 333);
        Student student3 = new StudentComputerScience("Dennis", 444);
        Student[] listSomeStudentNames = {student0, student1, student2, student3};
        StudentDB studentDB = new StudentDB(listSomeStudentNames);

        // System.out.println(student0.getName());
        // System.out.println(student0.getStudentID());
        // System.out.println(student0.toString());
        // System.out.println(studentDB.toString());

        for (int i = 0; i < 10; i++) {
            Student student = studentDB.randomStudent();
            System.out.println(student);
            printSubject(student);
        }
    }

    public static void printSubject(Student student) {
        System.out.println(student.getSubject());
    }
}