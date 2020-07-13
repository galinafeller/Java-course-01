package homework.hw_2;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {

        System.out.println("Input a:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println("Input b:");
        Scanner in1 = new Scanner(System.in);
        int b = in1.nextInt();
        if (b == a) {
            System.out.println("Error");
            return;
        }

        System.out.println("Input c:");
        Scanner in2 = new Scanner(System.in);
        int c = in2.nextInt();
        if (c == a | c == b) {
            System.out.println("Error");
            return;
        }

        int[] arr = new int[] {a,b,c};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
