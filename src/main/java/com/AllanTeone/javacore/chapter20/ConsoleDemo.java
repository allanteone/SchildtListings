package main.java.com.AllanTeone.javacore.chapter20;

import java.io.*;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if (con == null) return;

        str = con.readLine("Enter line: ");
        con.printf("Entered line is: %s\n", str);
    }
}
