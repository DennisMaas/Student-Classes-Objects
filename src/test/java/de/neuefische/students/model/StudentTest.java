package de.neuefische.students.model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class StudentTest {

    @Test
    void testEqualTrue() {
        //Given
        Student student1 = new Student("Dennis");
        Student student2 = new Student("Dennis");
        student1.setImmatriculationNumber(123);
        student2.setImmatriculationNumber(123);

        //When
        boolean studentsAreEqual = student1.equals(student2);


        //Then
        Assertions.assertTrue(studentsAreEqual);
    }


    @Test
    void testEqualFalse() {
        //Given
        Student student1 = new Student("Hans");
        Student student2 = new Student("Dennis");
        student1.setImmatriculationNumber(987);
        student2.setImmatriculationNumber(123);

        //When
        boolean studentsAreEqual = student1.equals(student2);


        //Then
        Assertions.assertFalse(studentsAreEqual);

    }
}