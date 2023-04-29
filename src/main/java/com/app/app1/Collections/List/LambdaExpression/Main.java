package com.app.app1.Collections.List.LambdaExpression;

import com.app.app1.Collections.List.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;

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
        MyComparator.sortByName(students);
//        Collections.sort(students);
        System.out.println("Sorting based on name");
        System.out.println(students);

        MyComparator.sortByAgeInReverseOrder(students);
        System.out.println("Sorting based by age reverse order");
        System.out.println(students);

        MyComparator.sortByAge(students);
        System.out.println("Sorting based by age");
        System.out.println(students);

        MyComparator.sortByNameInReverseOrder(students);
        System.out.println("Sorting based on name reverse order");
        System.out.println(students);

        MyComparator.sortByScore(students);
        System.out.println("Sorting based on score");
        System.out.println(students);

        MyComparator.sortByScoreInReverseOrder(students);
        System.out.println("Sorting based on score reverse order");
        System.out.println(students);
    }
}
