package designProblems.chessDesign.pieces;


import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;

public class King extends Piece{
    public King(Colour colour){
        super(colour,6);
    }
    @Override
    public void findAllPossibleMoves(Board board, int x, int y){
        Cell[][] cells = board.getCells();
        Cell fromCell = cells[x][y];
        int[][] moves = {
                {x+1, y}, {x-1, y},
                {x, y+1}, {x, y-1},
                {x+1, y+1}, {x-1, y-1},
                {x+1, y-1}, {x-1, y+1}
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