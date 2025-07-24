package designProblems.TicTacToe.util;

import designProblems.TicTacToe.enums.Symbol;
import designProblems.TicTacToe.strategies.PlayerStrategy;

public class Player {
    public String name;
    public Symbol symbol;
    PlayerStrategy playerStrategy;
    public Player(Symbol symbol, String name, PlayerStrategy playerStrategy){
        this.symbol=symbol;
        this.name=name;
        this.playerStrategy=playerStrategy;
    }
    public Position makeMove(Board board){
        return playerStrategy.makeMove(board,this);
    }
    public boolean isValidMove(Board board, Position position){
        int size=board.cells.length;
        if(position.y<0 || position.x<0 || position.y>=size || position.x>=size){
            return false;
        }
        return (board.cells[position.x][position.y].symbol)==Symbol.EMPTY;
    }
    public boolean isWin(Board board){
        int size=board.cells.length;
        int []row=new int[size];
        int []col=new int[size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if (board.cells[i][j].symbol==this.symbol){
                    row[i]++;
                    col[j]++;
                }
                if(row[i]==size || col[j]==size){
                    return true;
                }
            }
        }
        return false;
    }
}
