package designProblems.chessDesign;

import designProblems.chessDesign.core.Board;
import designProblems.chessDesign.core.Cell;
import designProblems.chessDesign.core.Player;
import designProblems.chessDesign.pieces.Colour;
import designProblems.chessDesign.pieces.Piece;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Scanner sc = new Scanner(System.in);
    public Game(String name1,String name2){
        board=new Board();
        player1=new Player(name1,Colour.WHITE);
        player2=new Player(name2,Colour.BLACK);
    }
    public void play(){
        System.out.println("Welcome to Chess");
        System.out.println("chessDesign.core.Player 1: "+player1.name+" Colour: "+player1.colour);
        System.out.println("chessDesign.core.Player 2: "+player2.name+" Colour: "+player2.colour);
        System.out.println("chessDesign.Game Starts");
        boolean isPlayer1Turn=true;
        while (true){
            if(isPlayer1Turn){
                System.out.println("chessDesign.core.Player 1's turn");
            }else{
                System.out.println("chessDesign.core.Player 2's turn");
            }
            board.printBoard();
            System.out.println("Enter the piece you want to move");
            System.out.println("Enter the x coordinate");
            int x=sc.nextInt();
            System.out.println("Enter the y coordinate");
            int y=sc.nextInt();
            if(x<0 || x>7 || y<0 || y>7 || board.getCells()[x][y].getPiece()==null){
                System.out.println("Invalid coordinates");
            }else{
                Cell cellToBeMoved =board.getCells()[x][y];
                Piece pieceToBeMoved=cellToBeMoved.getPiece();
                if(isPlayer1Turn && cellToBeMoved.getPiece().getColour()!= Colour.WHITE){
                    System.out.println("Invalid move");
                }else if(!isPlayer1Turn && cellToBeMoved.getPiece().getColour()!=Colour.BLACK){
                    System.out.println("Invalid move");
                }else{
                    pieceToBeMoved.findAllPossibleMoves(board,x,y);
                    System.out.println("Enter the x coordinate of the cell you want to move to");
                    int x1=sc.nextInt();
                    System.out.println("Enter the y coordinate of the cell you want to move to");
                    int y1=sc.nextInt();
                    if(x1<0 || x1>7 || y1<0 || y1>7) {
                        System.out.println("Invalid coordinates");
                    }else{
                        Cell cellToBeMovedTo=board.getCells()[x1][y1];
                        if(cellToBeMovedTo.getPiece()!=null && cellToBeMovedTo.getPiece().getColour()==pieceToBeMoved.getColour()){
                            System.out.println("Invalid move");
                        }else{
                            if(cellToBeMovedTo.getPiece()!=null && cellToBeMovedTo.getPiece().getSymbol()==6){
                                if(isPlayer1Turn){
                                    System.out.println("chessDesign.core.Player 1 wins");
                                }else {
                                    System.out.println("chessDesign.core.Player 2 wins");
                                }
                                break;
                            }
                            cellToBeMovedTo.setPiece(pieceToBeMoved);
                            cellToBeMoved.setPiece(null);
                            isPlayer1Turn = !isPlayer1Turn;
                        }
                    }
                }
            }

        }
    }
}
