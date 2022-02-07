package Lesson_2;
/*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
 в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        plusInt();
    }

    public static void plusInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = s.nextInt();
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }
}
