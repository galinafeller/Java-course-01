package homework.hw_2;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random r = new Random();
        int random = r.nextInt(900) + 100;
        int k, max = 0, n, l;

        System.out.println(random);
        k = random % 10;
        n = (random - k) / 10 % 10;
        l = (random - k - (n * 10)) / 100;

        if (l > n) {
            max = l;
        } else {
            max = n;
        }
        if (k > max) {
            max = k;
        }
        System.out.println(max + " is max number");
    }

}
