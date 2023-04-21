package main.java.com.AllanTeone.javacore.chapter18;

import java.util.*;

public class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");
    }


}
