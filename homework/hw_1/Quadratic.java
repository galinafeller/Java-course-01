package homework.hw_1;

public class Quadratic {

    public static void main(String[] args) {

        // ax^2 + bx + c = 0

        double a = 5, b= 10, c = 29;
        double pow = 2;
        double d, x1, x2;

        d = Math.pow(b,pow) - 4 * a * c;
        System.out.println("Discriminant: " + d);

        if (a == 0) {

            if (b == 0) {
                System.out.println("Your quadratic equation has no solutions");
            } else {
                x1 = -c / b;
                System.out.println("Your equation has just one solution: " + x1);
            }

        } else {

            if (d > 0){

                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("First root of an equation: " + x1);
                System.out.println("Second root of an equation: " + x2);

            } else if (d == 0) {

                x1 = -b / 2 * a;

                System.out.println("Your quadratic equation has just one solution: " + x1);
            } else {
                System.out.println("Your quadratic equation has no solutions");
            }
        }
    }
}
