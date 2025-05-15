package designProblems.snakeLadder;

public class Cell {
    private int number;
    private Snake snake;
    private Ladder ladder;
    public Cell(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setSnake(Snake snake) {
        this.snake = snake;
    }
    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }
    public Snake getSnake() {
        return snake;
    }
    public Ladder getLadder() {
        return ladder;
    }
}
