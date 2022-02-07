package Lesson_2;
/*Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
 одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

import java.util.Scanner;
import java.util.Arrays;


public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Введите количество ячек массива:");
        Scanner len = new Scanner(System.in);
        int x = len.nextInt();

        System.out.println("Введите значение:");
        Scanner initialValue = new Scanner(System.in);
        int y = initialValue.nextInt();

        int[] ar = Task_9.array(x, y);
        System.out.println(Arrays.toString(ar));
    }

    public static int[] array(int x, int initialValue) {
        int array[] = new int[x];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;


        }
        return array;


    }
}
