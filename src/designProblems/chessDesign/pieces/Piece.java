package designProblems.chessDesign.pieces;

import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;

public abstract class Piece {
    private int symbol;
    public Colour colour;
    public Piece( Colour colour,int symbol){
        this.colour = colour;
        this.symbol=symbol;
    }
    public Colour getColour(){
        return colour;
    }
    public int getSymbol(){
        return symbol;
    }
    boolean checkWithinBoard(int x, int y){
        if(x<0 || y<0 || x>7 || y>7){
            return false;
        }
        return true;
    }
    boolean moveTo(Cell[][] cells, Cell fromCell, int upX, int upY, boolean movePossible){
        if(checkWithinBoard(upX,upY) && movePossible){
            if(cells[upX][upY].getPiece() == null){
                System.out.println("Move to "+upX+" "+upY);
            }else{
                if(cells[upX][upY].getPiece().getColour() != fromCell.getPiece().getColour()){
                    System.out.println("Capture "+upX+" "+upY);
                }
                movePossible = false;
            }
        }
        return movePossible;
    }

    public abstract void findAllPossibleMoves(Board board, int x, int y);
}