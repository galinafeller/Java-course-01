package homework.hw_1;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        int i, j, k;

        System.out.println("Table of prime numbers from 2 to N\n");

        System.out.println("Insert N:");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (i = 2; i <= n; i++) {

            k = 0;
            for (j=2; j <= i; j++) {
                if ((i%j) == 0) {
                    k++;
                }
            }
            if (k<2) {
                System.out.println(i);
            }
        }
    }
}
