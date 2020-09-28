package de.neuefische.students.model;

import java.util.Objects;

public class Student {

    private String name;
    private int immatriculationNumber = 6795678;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return immatriculationNumber == student.immatriculationNumber &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, immatriculationNumber);
    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getImmatriculationNumber() {
        return immatriculationNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setImmatriculationNumber(int immatriculationNumber) {
        this.immatriculationNumber = immatriculationNumber;
    }

}
