package de.neuefische.students.model;

import de.neuefische.students.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class StudentHistory implements Student {
    private String name;
    private int Id;

   public String getSubject() {
       return "History";
   }
}
