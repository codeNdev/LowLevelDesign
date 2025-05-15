package designProblems.snakeLadder;

public class Board {
    private int size;
    private Cell[] cells;
    public Board(int size) {
        this.size = size;
        cells = new Cell[size+1];
        initializeBoard();
    }
    public void initializeBoard() {
        for (int i = 0; i <= size; i++) {
            cells[i] = new Cell(i);
        }
    }
    public int getSize() {
        return size;
    }
    public Cell[] getCells() {
        return cells;
    }
}
