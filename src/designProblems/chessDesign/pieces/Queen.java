package designProblems.chessDesign.pieces;

import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;

public class Queen extends Piece{
    public Queen(Colour colour){
        super(colour,5);
    }
    @Override
    public void findAllPossibleMoves(Board board, int x, int y){
        Cell[][] cells = board.getCells();
        Cell fromCell = cells[x][y];
        boolean up=true,
                down=true,
                left=true,
                right=true,
                upLeft=true,
                upRight=true,
                downLeft=true,
                downRight=true;
        for(int i = 1; i < 8; i++){
            int upX = x+i;int upY = y;
            up=moveTo(cells,fromCell,upX,upY,up);
            int downX = x-i;int downY = y;
            down= moveTo(cells,fromCell,downX,downY,down);
            int leftX = x;int leftY = y-i;
            left = moveTo(cells,fromCell,leftX,leftY,left);
            int rightX = x;int rightY = y+i;
            right= moveTo(cells,fromCell,rightX,rightY,right);
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