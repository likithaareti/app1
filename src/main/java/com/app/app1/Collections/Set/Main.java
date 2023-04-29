package com.app.app1.Collections.Set;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> books = new TreeSet<>(new MyComparator());// Customized sorting
        books.add("A");
        books.add("B");
        books.add("Z");
        books.add("N");
        books.add("M");
        books.add("O");
        books.add("X");
        books.add("X");
        System.out.println(books);
    }
}
