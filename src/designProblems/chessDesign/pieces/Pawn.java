package designProblems.chessDesign.pieces;
import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;

public class Pawn extends Piece{
    public Pawn( Colour colour) {
        super(colour,1);
    }
    @Override
    public void findAllPossibleMoves(Board board, int x, int y){
        Cell [][] cells = board.getCells();

        if(this.colour == Colour.WHITE){
            if(x==1){
                if (cells[x+1][y].getPiece() == null && cells[x+2][y].getPiece() == null){
                    System.out.println("Move to "+(x+2) +" "+y);
                }
            }
            if (cells[x+1][y].getPiece() == null){
                System.out.println("Move to "+(x+1) +" "+y);
            }
            if (y-1 >= 0 && cells[x+1][y-1].getPiece() != null && cells[x+1][y-1].getPiece().getColour() == Colour.BLACK){
                System.out.println("Capture "+(x+1) +" "+(y-1));
            }
            if (y+1 < 8 && cells[x+1][y+1].getPiece() != null && cells[x+1][y+1].getPiece().getColour() == Colour.BLACK){
                System.out.println("Capture "+(x+1) +" "+(y+1));
            }
        }else{
            if(x==6){
                if (cells[x-1][y].getPiece() == null && cells[x-2][y].getPiece() == null){
                    System.out.println("Move to "+(x-2) +" "+y);
                }
            }
            if (cells[x-1][y].getPiece() == null){
                System.out.println("Move to "+(x-1) +" "+y);
            }
            if (y-1 >= 0 && cells[x-1][y-1].getPiece() != null && cells[x-1][y-1].getPiece().getColour() == Colour.WHITE){
                System.out.println("Capture "+(x-1) +" "+(y-1));
            }
            if (y+1 < 8 && cells[x-1][y+1].getPiece() != null && cells[x-1][y+1].getPiece().getColour() == Colour.WHITE){
                System.out.println("Capture "+(x-1) +" "+(y+1));
            }
        }
    }
}

