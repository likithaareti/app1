package com.app.app1.Collections.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private Long score;

    //    public static Comparator<Student> studentNameComparator = (o1, o2) -> o1.getScore().compareTo(o2.getScore());
    public static Comparator<Student> studentNameComparator = Comparator.comparing(Student::getScore);
}
