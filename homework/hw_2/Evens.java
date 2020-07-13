package homework.hw_2;

import java.util.Scanner;

public class Evens {
    public static void main(String[] args) {

        System.out.println("Input your number N:");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
    }
}
