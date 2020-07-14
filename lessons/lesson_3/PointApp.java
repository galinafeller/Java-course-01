package lessons.lesson_3;

public class PointApp {

    public static void main(String[] args) {
        //объявить переменную нашего типа
        //а и p - локальные переменные, доступны только в методе
        int a = 150;
        Point p = new Point(3,5);
        //p.x = 3;
        //p.y = 5;

        System.out.println("Координаты точки (" + p.x + ";" + p.y + ")");

        Point leftPoint = new Point(10,13);
        //leftPoint.x = -10;
        //leftPoint.y = 13;

        p.printPoint();
        leftPoint.printPoint(true);

        int leftPointQuadrant = leftPoint.quadrant();
        System.out.println("Квадрант точки:" + leftPointQuadrant);
    }
}
