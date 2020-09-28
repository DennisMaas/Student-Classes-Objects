package de.neuefische.students.model;

public class Student {

    private String name;
    private int age = 10;
    private int immatriculationNumber = 6795678;

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getImmatriculationNumber() {
        return immatriculationNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setImmatriculationNumber(int immatriculationNumber) {
        this.immatriculationNumber = immatriculationNumber;
    }

}
