package Lesson_5;

import java.util.ArrayList;


public class Box<T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    public Box(){
    }
    public float getWeight(){
        float weight = 0.0f;

        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }
    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }
    public void pourTo(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount){
        for(int i=0;i<amount;i++){
            box.add(fruit);
        }
    }

public static void allBoxes() {
    Box<Orange> orange = new Box<>();
    Box<Orange> orange1 = new Box<>();
    Box<Apple> apple = new Box<>();
    Box<Apple> apple1 = new Box<>();

    System.out.println("Добавляем в коробку ");
    orange.addFruit(new Orange(), 14);
    orange1.addFruit(new Orange(), 2);
    apple.addFruit(new Apple(), 1);
    apple1.addFruit(new Apple(), 11);
    System.out.println("Box 1: " + orange.getWeight());
    System.out.println("Box 2: " + orange1.getWeight());
    System.out.println("Box 3: " + apple.getWeight());
    System.out.println("Box 4: " + apple1.getWeight());

    System.out.println("Сравниваем");
    System.out.println("Box 1 equals box 3: " + orange.compare(apple));
    System.out.println("Box 2 equals box 4: " + orange1.compare(apple1));

    System.out.println("Пересыпаем");
    orange.pourTo(orange1);
    apple.pourTo(apple1);

    System.out.println("Вес коробок ");
    System.out.println("Box 1: " + orange.getWeight());
    System.out.println("Box 2: " + orange1.getWeight());
    System.out.println("Box 3: " + apple.getWeight());
    System.out.println("Box 4: " + apple1.getWeight());
}}