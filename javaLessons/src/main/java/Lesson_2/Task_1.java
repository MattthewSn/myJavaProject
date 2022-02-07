package Lesson_2;
/* Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
 от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        System.out.println(within10And20(a));
    }

    public static boolean within10And20(int x1) {
        return (x1 >= 10 && x1 <= 20);
    }
}
