package main.java.com.AllanTeone.javacore.chapter15;

interface MyFunc {
    MyClass func(int n);
}

class MyClass {
    private int val;

    MyClass(int v) { val = v; }

    MyClass() { val = 0; }

    int getVal() { return val; }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("Значение val в обьекте mc равно " + mc.getVal());
    }
}
