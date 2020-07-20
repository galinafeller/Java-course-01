package homework.hw_3;

import java.util.Arrays;

public class PointApp {

    public static void main(String[] args) {
        int a = 150;
        homework.hw_3.Point p = new homework.hw_3.Point(3,6);

        System.out.println("Координаты точки (" + p.x + ";" + p.y + ")");

        homework.hw_3.Point leftPoint = new Point(10,13);

        p.printPoint();
        leftPoint.printPoint(true);

        int leftPointQuadrant = leftPoint.quadrant();
        System.out.println("Квадрант точки:" + leftPointQuadrant);

        int[] flipXY = p.flip();
        int flipX = flipXY[0];
        int flipY = flipXY[1];
        System.out.println("\nНовые координаты точки: (" + flipX + ";" + flipY + ")");
    }
}

