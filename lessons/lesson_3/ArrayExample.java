package lessons.lesson_3;

public class ArrayExample {
    public static void main(String[] args) {
        //объявление массива
        int[] arr = new int[5];
        arr[0] = 15;
        arr[2] = 46;
        //Длину массива изменить нельзя! Неизменяемый участок памяти
        //Чтобы изменить длину массива - создать новый и скопировать туда старый массив
        //в java нет механизма динамической работы с памятью
        System.out.println("Первый элемент:" + arr[0]);
        System.out.println("Второй элемент:" + arr[2]);
        //index - сдвиг вправо относительно 0-й ячейки
        for (int index = 0; index < arr.length; index++) {
            System.out.println("Индекс: " + index + ", значение: " + arr[index]);
        }
    }
}
