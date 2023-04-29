package com.app.app1.Collections.List.LambdaExpression;

import com.app.app1.Collections.List.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adesh", 24, 899L));
        students.add(new Student("B", 30, 123L));
        students.add(new Student("a", 40, 232L));
        students.add(new Student("C", 28, 322L));
        students.add(new Student("D", 29, 423L));
        students.add(new Student("E", 28, 234L));
        students.add(new Student("F", 27, 324L));
        students.add(new Student("G", 26, 445L));
        students.add(new Student("H", 25, 122L));
        students.add(new Student("I", 20, 10L));
        System.out.println(students);
        MyComparator.sortByName(students);
//        Collections.sort(students);
        System.out.println(students);

        MyComparator.sortByAgeInReverseOrder(students);
        System.out.println(students);

        MyComparator.sortByAge(students);
        System.out.println(students);

        MyComparator.sortByNameInReverseOrder(students);
        System.out.println(students);

        MyComparator.sortByScore(students);
        System.out.println(students);

        MyComparator.sortByScoreInReverseOrder(students);
        System.out.println(students);
    }
}
