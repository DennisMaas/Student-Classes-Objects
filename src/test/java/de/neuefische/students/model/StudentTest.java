package de.neuefische.students.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void testEqualTrue() {
        //Given
        Student student1 = new StudentHistory("Dennis", 123);
        Student student2 = new StudentHistory("Dennis", 123);

        //When
        boolean studentsAreEqual = student1.equals(student2);

        //Then
        Assertions.assertTrue(studentsAreEqual);
    }


    @Test
    void testEqualFalse() {
        //Given
        Student student1 = new StudentComputerScience("Hans", 123);
        Student student2 = new StudentHistory("Dennis", 987);

        //When
        boolean studentsAreEqual = student1.equals(student2);


        //Then
        Assertions.assertFalse(studentsAreEqual);
    }
    @Test
    void testToString(){
        //Given
        Student student1 = new StudentComputerScience("Jakob", 111);

        //When
        String studentString = student1.toString();

        //Then
        Assertions.assertEquals("Student{name='Jakob', studentID=111}", studentString);
    }
}