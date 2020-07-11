package homework.hw_1;

public class FirstTask {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum, div, div2, mlt;
        double div3;
        sum = a + b;
        div = b / a;
        div2 = a % b;
        div3 = (double) a / b;
        mlt = a * b;

        System.out.println("sum = " + sum);
        System.out.println("division = " + div);
        System.out.println("remainder of division = " + div2);
        System.out.println("division with remainder = " + div3);
        System.out.println("multiplying = " + mlt);

    }
}
