package designProblems.chessDesign.pieces;

import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;

public class Bishop extends Piece{
    public Bishop( Colour colour){
        super(colour,3);
    }

    @Override
    public void findAllPossibleMoves(Board board, int x, int y){
        Cell[][] cells = board.getCells();
        Cell fromCell = cells[x][y];
        boolean upLeft=true,
                upRight=true,
                downLeft=true,
                downRight=true;
        for(int i = 1; i < cells.length; i++){
            int upLeftX = x+i;int upLeftY = y-i;
            upLeft= moveTo(cells,fromCell,upLeftX,upLeftY,upLeft);
            int upRightX = x+i;int upRightY = y+i;
            upRight= moveTo(cells,fromCell,upRightX,upRightY,upRight);
            int downLeftX = x-i;int downLeftY = y-i;
            downLeft= moveTo(cells,fromCell,downLeftX,downLeftY,downLeft);
            int downRightX = x-i;int downRightY = y+i;
            downRight= moveTo(cells,fromCell,downRightX,downRightY,downRight);
        }
    }
}