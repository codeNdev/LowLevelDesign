package designProblems.TicTacToe.controller;

import designProblems.TicTacToe.enums.Symbol;
import designProblems.TicTacToe.strategies.PlayerStrategy;
import designProblems.TicTacToe.util.Board;
import designProblems.TicTacToe.util.Player;
import designProblems.TicTacToe.util.Position;

public class Game {
    Player player1;
    Player player2;
    Board board;
    public Game(PlayerStrategy playerStrategy1,PlayerStrategy playerStrategy2,int size){
        player1=new Player(Symbol.X,"Rituraj",playerStrategy1);
        player2=new Player(Symbol.O,"Shibam",playerStrategy2);
        board=new Board(size);
    }
    public void play(){
        Player currentPlayer=player1;
        int moves=0;
        int size=board.cells.length;
        Player previousPlayer=player2;
        while (!previousPlayer.isWin(board) && moves<(size*size)){
            Position position= currentPlayer.makeMove(board);
            board.cells[position.x][position.y].setSymbol(currentPlayer.symbol);
            board.printBoard();
            previousPlayer=currentPlayer;
            currentPlayer=switchPlayer(currentPlayer);
            moves++;
        }
        if(previousPlayer.isWin(board)){
            System.out.println(previousPlayer.name + "Won the match");
        }else{
            System.out.println("The match became Draw");
        }
    }
    public Player switchPlayer(Player player){
        if(player==player1){
            return player2;
        }else {
            return player1;
        }
    }
}
