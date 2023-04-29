package com.app.app1.Collections.Set;

import java.util.Comparator;

public class MyComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((String)o2).compareTo((String)o1);
    }
}
