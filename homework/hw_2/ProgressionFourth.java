package homework.hw_2;

public class ProgressionFourth {
    public static void main(String[] args) {
        int n = 0, i = 2;

        do {
            System.out.println(n + " - " + i);
            i = i * 2;
            n++;
        } while (n < 20);
    }
}
