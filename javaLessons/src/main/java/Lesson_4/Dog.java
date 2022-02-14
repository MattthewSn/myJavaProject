package Lesson_4;

public class Dog extends Animals {
    int maxDogRun = 500;
    int maxDogSwim = 10;
    static int count;

    public Dog(String name) {

        super(name);
        count++;
    }

    @Override
    public void run(int animalRun) {
        if (animalRun > maxDogRun) {
            System.out.println(name + "  столько не бегаeт :) ");
        } else {
            System.out.println(name + " пробежал " + animalRun);
        }
    }

    public void swim(int animalSwim) {
        if (animalSwim > maxDogSwim) {
            System.out.println(name + "  столько не плавает :) ");
        } else {
            System.out.println(name + " проплыл " + animalSwim);
        }
    }
}
