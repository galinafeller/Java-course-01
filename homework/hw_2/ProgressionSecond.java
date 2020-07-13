package homework.hw_2;

public class ProgressionSecond {
    public static void main(String[] args) {
        int n = 0, i = 1;

        do {
            System.out.println(n + " - "+ i);
            i = i + 2;
            n++;
        } while (n < 55);
    }
}
