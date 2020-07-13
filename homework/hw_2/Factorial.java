package homework.hw_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int f = 1;
        System.out.println("Input your n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 1) {
            System.out.println("Error");
            return;
        }

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("n! = " + f);
    }
}
