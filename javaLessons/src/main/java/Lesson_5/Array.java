package Lesson_5;

import java.util.Arrays;

// Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)
public class Array {
    public static void arr() {
                       //
        String arr[] = {"я", "сентября",  "переверну и снова третье",  "календарь"};

        swap(arr, 1,3);
    }

    public static void swap(Object[] arr, int x, int y) {
        System.out.println("Task1: " + Arrays.toString(arr));
        System.out.println("================================");
        Object swap = arr[x];
        arr[x] = arr[y];
        arr[y] = swap;
        System.out.println("Вот так правильнее: " + Arrays.toString(arr) + "\n================================");
    }

}
