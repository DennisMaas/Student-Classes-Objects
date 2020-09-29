package de.neuefische.students.model;

import de.neuefische.students.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

public class StudentHistory extends Student {
    public StudentHistory(String name, int Id) {
        super(name, Id);
    }

   public String getSubject() {
       return "History";
   }

    @Override
    public int anzahlModule() {
        return 1;
    }
}
