package de.neuefische.students;

import de.neuefische.students.db.StudentDB;
import de.neuefische.students.model.Student;

public class AppMain {

    public static void main(String[] args) {

        Student student0 = new Student("Henny", 111);
        Student student1 = new Student("Elisabeth", 222);
        Student student2 = new Student("Jakob", 333);
        Student student3 = new Student("Dennis", 444);
        Student[] listSomeStudentNames = {student0, student1, student2,student3};
        StudentDB studentDB = new StudentDB(listSomeStudentNames);

       // System.out.println(student0.getName());
       // System.out.println(student0.getStudentID());
       // System.out.println(student0.toString());
       // System.out.println(studentDB.toString());

        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());
        System.out.println(studentDB.randomStudent());

    }
}