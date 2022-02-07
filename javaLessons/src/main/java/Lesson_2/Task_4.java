package Lesson_2;
/*Написать метод, которому в качестве аргументов передается строка и число,
 метод должен отпечатать в консоль указанную строку, указанное количество раз;*/

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введи текст:");
        String string = scanner.nextLine();

        System.out.println("Количество строк:");
        int count = scanner.nextInt();

        stringInt(string, count);
    }

    public static void stringInt(String s, int i) {
        do {
            System.out.println(s);
            i--;
        }
        while (i > 0);
    }

}
