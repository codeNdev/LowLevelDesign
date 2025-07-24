package designProblems.TicTacToe.strategies.concretestrategies;

import designProblems.TicTacToe.strategies.PlayerStrategy;
import designProblems.TicTacToe.util.Board;
import designProblems.TicTacToe.util.Player;
import designProblems.TicTacToe.util.Position;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy {
    Scanner scanner=new Scanner(System.in);
    @Override
    public Position makeMove(Board board, Player player) {
        Position position;
        do{
            System.out.println("Enter the x coordinate of cell, you want to move to: ");
            int x=scanner.nextInt();
            System.out.println("Enter the y coordinate of cell, you want to move to: ");
            int y=scanner.nextInt();
            position=new Position(x,y);
        }while (!player.isValidMove(board,position));
        return position;
    }
}
