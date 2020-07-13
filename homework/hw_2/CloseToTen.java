package homework.hw_2;

import java.util.Scanner;

public class CloseToTen {
    public static void main(String[] args) {

        System.out.println("Input n (positive):");
        Scanner in = new Scanner(System.in);
        float n = in.nextFloat();
        if (n < 0) {
            System.out.println("Error. Your number is negative. You need to restart it");
            return;
        }

        System.out.println("Inout m (positive)");
        Scanner in2 = new Scanner(System.in);
        float m = in2.nextFloat();
        if (m < 0) {
            System.out.println("Error. Your m is negative. You need to restart it");
            return;
        }

        float k = Math.abs(10 - n);
        float l = Math.abs(10 - m);

        if (k == l) {
            System.out.println(n + " and " + m + " are equidistant from 10");
        } else if (k < l) {
            System.out.println(n + " is closer to 10");
        } else {
            System.out.println(m + " is closer to 10");
        }
    }
}
