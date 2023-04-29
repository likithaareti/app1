package com.app.app1.Collections.List.LambdaExpression;

import com.app.app1.Collections.List.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class MyComparator {
    public static void sortByName(ArrayList<Student> students){
        students.sort((o1,o2)->o1.getName().compareTo(o2.getName())); // by using lambda expression
//        students.sort(Comparator.comparing(Student::getName)); // by using method reference operator ::
    }

    public static void sortByAge(ArrayList<Student> students){
//        students.sort((o1,o2)->o1.getAge().compareTo(o2.getAge()));
        students.sort(Comparator.comparing(Student::getAge));

    }

    public static void sortByScore(ArrayList<Student> students){
        students.sort(Comparator.comparing(Student::getScore));
    }
    public static void sortByNameInReverseOrder(ArrayList<Student> students){
        students.sort(Comparator.comparing(Student::getName).reversed());
    }
    public static void sortByAgeInReverseOrder(ArrayList<Student> students){
        students.sort(Comparator.comparing(Student::getAge).reversed());
    }
    public static void sortByScoreInReverseOrder(ArrayList<Student> students){
        students.sort(Comparator.comparing(Student::getScore).reversed());
    }
}
