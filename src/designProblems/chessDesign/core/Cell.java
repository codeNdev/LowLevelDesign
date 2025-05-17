package designProblems.chessDesign.core;

import designProblems.chessDesign.pieces.Piece;

public class Cell {
    private int x;
    private int y;
    private Piece piece;
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Cell(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Piece getPiece() {
        return piece;
    }
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public boolean isEmpty() {
        return piece == null;
    }
}
