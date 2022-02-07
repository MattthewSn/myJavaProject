package Lesson_2;
/*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        invertArray();
    }

    public static void invertArray() {
        int[] array = {0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i]--;
            } else {
                array[i]++;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
