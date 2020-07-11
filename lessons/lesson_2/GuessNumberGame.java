package lessons.lesson_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {
        int secretNumber = 0;
        int inputNumber;

        System.out.println("Insert your number");
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();

        Random randomizer = new Random();
        secretNumber = randomizer.nextInt(10);

        if (inputNumber == secretNumber) {
            System.out.println("Winner!");
        } else {
            //System.out.println("Looser! Secret number = " + secretNumber);
            if (inputNumber > secretNumber) {
                System.out.println("Your number is bigger than secret");
            } else {
                System.out.println("Your number is smaller than secret");
            }
        }

    }

}
