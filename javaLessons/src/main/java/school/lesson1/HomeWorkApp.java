package school.lesson1;


public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        printColor();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int i = 2;
        int j = 7;
        int c = i + j;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Красный");
        }
        if (a > 0) {
            System.out.println("Жёлтый");
        }

    }

    public static void compareNumbers() {
        int a = 20;
        int c = 20;
        if (a >= c) {
            System.out.println("a>=c");
        } else if (a < c) {
            System.out.println("a<c");
        }
    }


}