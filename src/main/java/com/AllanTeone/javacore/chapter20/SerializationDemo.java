package main.java.com.AllanTeone.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial.txt")))
        {
            MyClass object1 = new MyClass("hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objIStream = new ObjectInputStream(new FileInputStream("serial.txt")))
        {
            MyClass object2 = (MyClass) objIStream.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации: " + e);
            System.exit(0);
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
