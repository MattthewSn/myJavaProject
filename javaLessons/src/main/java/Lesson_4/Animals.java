package Lesson_4;

public abstract class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public void run(int animalRun) {
        System.out.println(name + " пробежал " + animalRun);
    }

    public void swim(int animalSwim) {
        System.out.println(name + " проплыл " + animalSwim);
    }

}


