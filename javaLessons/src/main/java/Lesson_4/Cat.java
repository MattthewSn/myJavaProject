package Lesson_4;

public class Cat extends Animals {
    private int maxCatRun = 200;
    private int maxCatSwim = 0;
    private int appetite;
    private boolean fullness;
    static int count;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        this.fullness = false;
        count++;
    }

    public void eat(Plate plate) {
        this.fullness = plate.getFood(this.appetite);
    }

    public void getFulness() {
        if (this.fullness == true) {
            System.out.println("Koт " + this.name + " покушал");
        } else {

            System.out.println("Котику " + this.name + " не хватило еды");
        }
    }

    @Override
    public void run(int animalRun) {
        if (animalRun > maxCatRun) {
            System.out.println(name + "  столько не бегаeт :) ");
        } else {
            System.out.println(name + " пробежал " + animalRun);
        }
    }

    public void swim(int animalSwim) {
        if (animalSwim > maxCatSwim) {
            System.out.println(name + " не может плавать");
        }

    }
}



