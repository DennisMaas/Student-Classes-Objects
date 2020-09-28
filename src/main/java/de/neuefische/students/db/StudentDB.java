package de.neuefische.students.db;

import de.neuefische.students.model.Student;

import java.util.Arrays;


public class StudentDB {

    private Student[] students;

    public StudentDB (Student[] studentArray){
        this.students = studentArray;
    }

    public Student[] list() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent() {
       double randomNumber = Math.random();
       int randomIndex = (int)(randomNumber * students.length);
       return students[randomIndex];
    }

    public void add(Student newStudent){

        Student[] newStudentsArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudentsArray[i] = students[i];
        }
        newStudentsArray[newStudentsArray.length-1] = newStudent;
        students = newStudentsArray;

        /*
        Student[] newStudentsArray = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudentsArray, 0, students.length);
        newStudentsArray[newStudentsArray.length-1] = newStudent;
        students = newStudentsArray;

         */

        //students = ArrayUtils.add(students,newStudent);
        //ich kann die ArrayUtils hierfür nicht runterladen‚
    }

    public void remove(){
        Student[] newStudentsArray = new Student[students.length - 1];
        for (int i = 0; i < students.length - 1; i++) {
            newStudentsArray[i] = students[i];
        }
        students = newStudentsArray;

    }
}