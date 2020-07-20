package homework.hw_3;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {1,23,345,12,35,56,45,3,312,34,234,14,23,13,6,57648,5,75,58,4,746,4567,236,645};

        int min = min(array);
        System.out.println("Минимум заданного массива: " + min);

        int max = max(array);
        System.out.println("\nМаксимум заданноного массива: " + max);


    }

    static int min(int[] array){
        int min = array[0] + 1;
        for(int i = 0; i < array.length; i++){
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
