package main.java.com.AllanTeone.javacore.chapter20;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Ниже приведены некоторые числовые значения в разных формах.\n");

        System.out.printf("Разные целочисленные форматы: ");
        System.out.printf("%d 5(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Фopмaт чисел с плавающей точкой по умолчанию : %f\n", 1234567.123);
        System.out.printf("Фopмaт чисел с плавающей точкой, разделяемых запятыми: %,f\n", 1234567.123);
        System.out.printf("Фopмaт отрицательных чисел с плавающей точкой по умолчанию: %,f\n", -1234567.123);
        System.out.printf("Другой фopмaт чисел с плавающей точкой: %,(f\n", -1234567.123);

        System.out.println();

        System.out.printf("Bыpaвнивaниe положительных и отрицательных числовых значений:\n");
        System.out.printf("% ,.2f\n% ,.2f\n" , 1234567.123, -1234567.123);

    }
}
