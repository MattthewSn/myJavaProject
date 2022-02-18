package Lesson_5;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        System.out.println("\n"+"Добро пожаловать в игру 'Угадай мелодию'. Нужно узнать припев песни:");

        String arr[] = {"ты", "былью", "не", "всё", "после", "после", "обернётся", "долгих",
                "слезам", "сладкий", "верь", "ночей", "вернётся", "ночей", "сон", "долгих"};
        System.out.println(Arrays.toString(arr)+ "\n");
        //зашифровано
        swap(arr, 1, 2);
        swap(arr, 2, 10);
        swap(arr, 3, 8);
        swap(arr, 8, 4);
        swap(arr, 5, 12);
        swap(arr, 6, 8);
        swap(arr, 8, 11);
        swap(arr, 10, 9);
        swap(arr, 11, 14);
        swap(arr, 12, 14);
        swap(arr, 15, 13);
        swap(arr, 13, 14);

        song(arr);

    }

    public static void swap(Object[] arr, int n1, int n2) {
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
    }

    public static void song(Object[] arr) {
        System.out.println("Для вывода ответа на экран введи что-нибудь:");
        Scanner sc = new Scanner(System.in);
        String something = sc.nextLine();
        System.out.println("Ответ: " + Arrays.toString(arr));
    }
}
