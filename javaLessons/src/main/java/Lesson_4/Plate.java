package Lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean getFood(int maxAmountFood) {
        if ((this.food - maxAmountFood) >= 0) {
            this.food -= maxAmountFood;
            return true;
        } else {

            return false;
        }
    }

    public void info()
    {
        System.out.println("В миске осталось "+this.food +" едениц еды");
        System.out.println();
    }


    public void addFood(int food){
        this.food += food;
    }

}
