package designProblems.chessDesign.pieces;

public enum Colour {
    WHITE,
    BLACK;

    public Colour getOpposite() {
        return this == WHITE ? BLACK : WHITE;
    }
}
