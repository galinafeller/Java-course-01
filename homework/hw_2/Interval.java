package homework.hw_2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Input number from set: [5;155]");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 5) {
            System.out.println("Error. Your number is not element of set.");
            return;
        } else if (n > 155) {
            System.out.println("Error. Your number is not element of set.");
            return;
        }

        if (n > 25 & n < 100) {
            System.out.println(n + " is element of set (25;100)");
        } else {
            System.out.println(n + " is not element of set (25;100)");
        }
    }
}
