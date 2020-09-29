package de.neuefische.students.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@AllArgsConstructor
@Data
public abstract class Student {
    private String name;
    private int Id;

    public abstract String getSubject();

    public abstract int anzahlModule();
}
