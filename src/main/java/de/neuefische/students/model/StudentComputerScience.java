package de.neuefische.students.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import de.neuefische.students.model.Student;

@AllArgsConstructor
@Data
public class StudentComputerScience implements Student {
    private String name;
    private int Id;

    public String getSubject() {
        return "Computer Science";
    }

}
