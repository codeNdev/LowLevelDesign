package designProblems.TicTacToe.util;

import designProblems.TicTacToe.enums.Symbol;

public class Board {
    public Cell[][] cells;
    public Board(int size){
        cells=new Cell[size][size];
        initializeBoard();
    }
    public void printBoard(){
        int size=cells.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if (cells[i][j].symbol== Symbol.EMPTY){
                    System.out.print("_ ");
                }else if(cells[i][j].symbol==Symbol.X){
                    System.out.print("X ");
                }else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
    public void initializeBoard(){
        int size=cells.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                cells[i][j]=new Cell(Symbol.EMPTY);
            }
        }
    }

}
