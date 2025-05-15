package designProblems.snakeLadder;

public class Dice {
    private int sides;
    private int currentValue;

    public Dice(int sides) {
        this.sides = sides;
        this.currentValue = 0;
    }

    public int roll() {
        currentValue = (int) (Math.random() * sides) + 1;
        return currentValue;
    }
}
