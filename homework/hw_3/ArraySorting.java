package homework.hw_3;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {134,6645,2342,5,456,356,45,6,345,2,24,1,3,34,52,4,23,56,7,789,675,78,8};

        int[] arraySorted = bubbleSort(array);
        System.out.println(Arrays.toString(arraySorted));
    }

    static int[] bubbleSort(int[] array){
        for (int j = 0; j < array.length; j++){
            int f = 0;
            for (int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]) {
                    array[i] = array[i] + array[i + 1] - (array[i + 1] = array[i]);
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }
        return array;
    }
}
