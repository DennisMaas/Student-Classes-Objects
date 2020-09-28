package de.neuefische.students;

import de.neuefische.students.model.Student;

public class AppMain {

    public static void main(String[] args) {

        Student student = new Student("Henny Haelbich", 111);
        Student student2 = new Student("Elisabeth", 222);
        Student[] listSomeStudentNames = {student, student2};
       // System.out.println(student.getName());
       // System.out.println(student.getStudentID());
       // System.out.println(student.toString());
        System.out.println(listSomeStudentNames.toString());
    }
}