package de.neuefische.students.model;

import java.util.Objects;

public interface Student {
    public String getSubject();

    @Override
    public boolean equals(Object o);

    @Override
    public int hashCode();

    public String getName();

    public int getId();

    public void setName(String name);

    public void setId(int studentID);

    @Override
    public String toString();
}
