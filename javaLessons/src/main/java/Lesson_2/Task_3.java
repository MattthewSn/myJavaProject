package Lesson_2;
/*Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,если
 число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.*/

import java.util.Scanner;


public class Task_3 {
    public static void main(String[] args) {
        System.out.println(isNegative());

    }

    public static boolean isNegative() {
        Scanner sс = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sс.nextInt();
        if (x >= 0) {
            return true;

        }
        return false;


    }


}
