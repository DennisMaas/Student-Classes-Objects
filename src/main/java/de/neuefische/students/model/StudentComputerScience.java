package de.neuefische.students.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import de.neuefische.students.model.Student;

public class StudentComputerScience extends Student {
    public StudentComputerScience(String name, int Id) {
        super(name, Id);
    }

    public String getSubject() {
        return "Computer Science";
    }

    @Override
    public int anzahlModule() {
        return 1;
    }


}
