package designProblems.chessDesign.pieces;

import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;

public class Rooke extends Piece{
    public Rooke( Colour colour){
        super(colour,4);
    }
    @Override
    public void findAllPossibleMoves(Board board, int x, int y){
        Cell[][] cells = board.getCells();
        Cell fromCell = cells[x][y];
        boolean up=true,
                down=true,
                left=true,
                right=true;
        for(int i = 1; i < cells.length; i++){
            int upX = x+i;int upY = y;
            up=moveTo(cells,fromCell,upX,upY,up);
            int downX = x-i;int downY = y;
            down= moveTo(cells,fromCell,downX,downY,down);
            int leftX = x;int leftY = y-i;
            left = moveTo(cells,fromCell,leftX,leftY,left);
            int rightX = x;int rightY = y+i;
            right= moveTo(cells,fromCell,rightX,rightY,right);
        }
    }
}