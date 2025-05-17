package designProblems.chessDesign.core;

import designProblems.chessDesign.pieces.*;

public class Board {
    public Cell[][] cells;
    public Board(){
        cells=new Cell[8][8];
        initializeBoard();
    }
    void initializeBoard(){
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i==1 || i==6){
                    if(i==1){
                        cells[i][j]=new Cell(i,j,new Pawn(Colour.WHITE));
                    }else{
                        cells[i][j]=new Cell(i,j,new Pawn(Colour.BLACK));
                    }
                }else if(i==0 || i==7){
                    if(j==0 || j==7){
                        if(i==0){
                            cells[i][j]=new Cell(i,j,new Rooke(Colour.WHITE));
                        }else{
                            cells[i][j]=new Cell(i,j,new Rooke(Colour.BLACK));
                        }
                    }else if(j==1 || j==6){
//                        KINGHT
                        if(i==0){
                            cells[i][j]=new Cell(i,j,new Knight(Colour.WHITE));
                        }else{
                            cells[i][j]=new Cell(i,j,new Knight(Colour.BLACK));
                        }
                    }
                    else if(j==2 || j==5){
//                        BISHOP
                        if(i==0){
                            cells[i][j]=new Cell(i,j,new Bishop(Colour.WHITE));
                        }else{
                            cells[i][j]=new Cell(i,j,new Bishop(Colour.BLACK));
                        }

                    }else if(j==3){
//                        QUEEN
                        if(i==0){
                            cells[i][j]=new Cell(i,j,new Queen(Colour.WHITE));
                        }else{
                            cells[i][j]=new Cell(i,j,new Queen(Colour.BLACK));
                        }
                    }else {
//                        KING
                        if(i==0){
                            cells[i][j]=new Cell(i,j,new King(Colour.WHITE));
                        }else{
                            cells[i][j]=new Cell(i,j,new King(Colour.BLACK));
                        }
                    }
                }else {
                    cells[i][j]=new Cell(i,j,null);
                }

            }
        }

    }
    public void printBoard(){
        for (int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(cells[i][j].getPiece()!=null){
                    System.out.print(cells[i][j].getPiece().getSymbol()+" ( "+i +","+ j+ " ) |");
                }else{
                    System.out.print("X"+" ( "+i +","+ j+ " ) |");
                }
            }
            System.out.println();
        }
    }
    public Cell[][] getCells(){
        return cells;
    }
}

