package com.app.app1.Collections.List.Comparator;

import com.app.app1.Collections.List.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Eswar",24,899L));
        students.add(new Student("Likitha",30,123L));
        students.add(new Student("Bhaskar",40,232L));
        students.add(new Student("Raghava",28,322L));
        students.add(new Student("Naga",29,423L));
        students.add(new Student("Lakshmi",28,234L));
        students.add(new Student("Venkat",27,324L));
        students.add(new Student("Padma",26,445L));
        students.add(new Student("Anantha",25,122L));
        students.add(new Student("Satya",20, 10L));
        System.out.println(students);
        Collections.sort(students,Student.studentNameComparator);
        System.out.println(students);
    }
}
