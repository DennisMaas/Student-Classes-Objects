package de.neuefische.students.db;

import de.neuefische.students.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void addTest() {
        // given
        Student[] initialStudents = {new Student("Jakob", 123)};
        StudentDB studentDB = new StudentDB(initialStudents);

        Student studentToAdd = new Student("Elisabeth", 789);

        // when
        studentDB.add(studentToAdd);
        Student[] studentListResult = studentDB.list();
        Student[] studentListExpected = {new Student("Jakob", 123),
                new Student("Elisabeth", 789)};

        //then
        assertArrayEquals(studentListExpected, studentListResult);

    }
}