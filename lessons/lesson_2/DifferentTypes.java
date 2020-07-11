package lessons.lesson_2;

@SuppressWarnings("ALL")

public class DifferentTypes {

    public static void main(String[] args) {
        int intValue = 65;
        long longValue = 5490;

        System.out.println(longValue / intValue);

        double doubleValue = longValue; //приведение типов
    }
}
