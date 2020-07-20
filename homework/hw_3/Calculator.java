package homework.hw_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double a = 10.5, b = 2.3;
        int c = 16, d = 4;
        long e = 2147483648L, f = 21486281L;

        System.out.println("1. Сложение:");

        double doubleAdd = add(a, b);
        System.out.println("double: " + a + " + " + b + " = " + doubleAdd);

        int intAdd = add(c, d);
        System.out.println("int: " + c + " + " + d + " = " + intAdd);

        long longAdd = add(e, f);
        System.out.println("long: " + e + " + " + f + " = " + longAdd);

        System.out.println("\n2. Деление:");

        int intDiv = divide(c, d);
        System.out.println("int: " + c + " / " + d + " = " + intDiv);

        double doubleDiv = divide(a, b);
        System.out.println("double: " + a + " / " + b + " = " + doubleDiv);

        long longDiv = divide(e, f);
        System.out.println("long: " + e + " / " + f + " = " + longDiv);

        System.out.println("\n3. Умножение:");

        int intMultiply = multiply(c, d);
        System.out.println("int: " + c + " * " + d + " = " + intMultiply);

        double doubleMultiply = multiply(a, b);
        System.out.println("double: " + a + " * " + b + " = " + doubleMultiply);

        long longMultiply = multiply(e, f);
        System.out.println("long: " + e + " * " + f + " = " + longMultiply);

        System.out.println("\n4. Вычитание:");

        int intSub = subtraction(c, d);
        System.out.println("int: " + c + " - " + d + " = " + intSub);

        double doubleSub = subtraction(a, b);
        System.out.println("double: " + a + " - " + b + " = " + doubleSub);

        long longSub = subtraction(e, f);
        System.out.println("long: " + e + " - " + f + " = " + longSub);
    }

    static int add(int a, int b) {
        int n = a + b;
        return n;
    }

    static double add(double a, double b) {
        double n = a + b;
        return n;
    }

    static long add(long a, long b) {
        long n = a + b;
        return n;
    }

    static int divide(int a, int b) {
        int n = a / b;
        return n;
    }

    static double divide(double a, double b) {
        double n = a / b;
        return n;
    }

    static long divide(long a, long b) {
        long n = a / b;
        return n;
    }

    static int multiply(int a, int b) {
        int n = a * b;
        return n;
    }

    static double multiply(double a, double b) {
        double n = a * b;
        return n;
    }

    static long multiply(long a, long b) {
        long n = a * b;
        return n;
    }

    static int subtraction(int a, int b) {
        int n = a - b;
        return n;
    }

    static double subtraction(double a, double b) {
        double n = a - b;
        return n;
    }

    static long subtraction(long a, long b) {
        long n = a - b;
        return n;
    }

}
