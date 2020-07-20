package homework.hw_3;
public class Point {
    int x, y;

    Point (int newX, int newY) {
        x = newX;
        y = newY;
    }

    void printPoint() {
        System.out.println("(" + x + ";" + y + ")");
    }

    void printPoint(boolean verbose) {
        if (verbose) {
            System.out.println("Координаты точки (" + x + ";" + y + ")");
        } else {
            printPoint();
        }
    }

    int quadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }

    //flip() - получить новый объект класса point с -x и -y
    int[] flip() {
        int[] flipped = new int[2];
        x = -x;
        y = -y;
        flipped[0] = x;
        flipped[1] = y;
        return flipped;
    }

}

