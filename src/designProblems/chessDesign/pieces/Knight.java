package designProblems.chessDesign.pieces;

import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;

public class Knight extends Piece{
    public Knight( Colour colour){
        super(colour,2);
    }
    @Override
    public void findAllPossibleMoves(Board board, int x , int y){
        Cell[][] cells = board.getCells();
        Cell fromCell = cells[x][y];
        int[][] moves = {
                {x+2, y+1}, {x+2, y-1},
                {x-2, y+1}, {x-2, y-1},
                {x+1, y+2}, {x+1, y-2},
                {x-1, y+2}, {x-1, y-2}
        };
        for (int [] move:moves){
            int moveX = move[0];
            int moveY = move[1];
            if(checkWithinBoard(moveX,moveY)){
                if(cells[moveX][moveY].getPiece() == null){
                    System.out.println("Move to "+moveX+" "+moveY);
                }else{
                    if(cells[moveX][moveY].getPiece().getColour() != fromCell.getPiece().getColour()){
                        System.out.println("Capture "+moveX+" "+moveY);
                    }
                }
            }
        }
    }
}
