package main.java.com.AllanTeone.javacore.chapter18;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.23));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
