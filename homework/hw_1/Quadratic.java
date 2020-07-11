package homework.hw_1;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        // ax^2 + bx + c = 0

        double d, x1, x2;
        double pow = 2;
        System.out.println("General type of quadratic equation is: ax^2 + bx + c = 0\n");

        System.out.println("Insert a");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Insert b");
        Scanner sc1 = new Scanner(System.in);
        double b = sc1.nextDouble();

        System.out.println("Insert c");
        Scanner sc2 = new Scanner(System.in);
        double c = sc2.nextDouble();

        d = Math.pow(b,pow) - 4 * a * c;
        System.out.println("\nDiscriminant: " + d);

        if (a == 0) {

            if (b == 0) {
                System.out.println("Your quadratic equation has no solutions");
            } else {
                x1 = -c / b;
                System.out.println("Your equation has just one solution: " + x1);
            }

        } else {

            if (d > 0){

                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("First root of an equation: " + x1);
                System.out.println("Second root of an equation: " + x2);

            } else if (d == 0) {

                x1 = -b / 2 * a;

                System.out.println("Your quadratic equation has just one solution: " + x1);
            } else {
                System.out.println("Your quadratic equation has no solutions");
            }
        }
    }
}
