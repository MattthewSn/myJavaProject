package Lesson_4;

public class HomeWork_4 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars",0);
        Cat cat2 = new Cat("Mars",0);
        Dog dog1 = new Dog("Boss");

        Plate plate = new Plate(5);

        Cat[] catsArr = new Cat[4];
        catsArr[0] = new Cat("Котик-бегемотик", 11);
        catsArr[1] = new Cat("Котик-койотик", 5);
        catsArr[2] = new Cat("Котик-кашалотик", 10);
        catsArr[3] = new Cat("Котик-живоглотик", 3);
        plate.addFood(16);
        for (int i = 0; i < catsArr.length; i++) {
            catsArr[i].eat(plate);
            catsArr[i].getFulness();
            plate.info();
        }


        cat1.run(200);
        cat1.run(201);
        cat1.swim(1);
        System.out.println();
        dog1.run(200);
        dog1.swim(1);
        dog1.swim(11);
        System.out.println();
        System.out.println("Количество котов: " + Cat.count);
        System.out.println("Количество собак: " + Dog.count);

    }


}






/*

  6.Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
  7.Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */