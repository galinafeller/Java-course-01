package homework.hw_1;

import java.util.Arrays;
import java.util.Scanner;

public class Erastofen {
    public static void main(String[] args) {

        System.out.println("Eratosthenes sieve from 2 to N\n");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i < n+1; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j < n+1; j += i) {
                    prime[j] = false;
                }
                System.out.println(i);
            }
        }
    }
}
