package homework.hw_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"собака", "кошка", "утка", "черепаха", "овца", "почтальон", "виселица"};
        Random random = new Random();
        String a = words[random.nextInt(words.length)];

       // System.out.println(a);

        char[] secret = a.toCharArray();
        double l = a.length();
        char[] game = new char[a.length()];
        Arrays.fill(game,'*');
        double n = l / 2;
        double k = Math.ceil(n);
        int fail = 0;
        boolean result = false;
        System.out.println("Загаданное слово: " + Arrays.toString(game));
        System.out.println("Всего попыток: " + (int) k);

        while (result == false){
            System.out.println("Введите букву:");
            Scanner in = new Scanner(System.in);
            char letter = in.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < a.length(); i++) {
                if (secret[i] == letter) {
                    game[i] = letter;
                    found = true;
                }
            }
            if (found) {
                System.out.println("Буква есть в слове: " + Arrays.toString(game));
                if (Arrays.equals(secret, game)) {
                    System.out.println("Победа!");
                    result = true;
                }
            } else {
                fail++;
                int g = (int)k - fail;
                System.out.println("Буквы в слове нет. Осталось попыток: " + g);
                if (g == 0) {
                    System.out.println("Game over");
                    return;
                }
            }
        }
    }

}
