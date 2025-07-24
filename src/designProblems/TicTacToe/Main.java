package designProblems.TicTacToe;

import designProblems.TicTacToe.controller.Game;
import designProblems.TicTacToe.strategies.concretestrategies.HumanPlayerStrategy;

public class Main {
    public static void main(String[] args) {
        Game tikTacToeGame=new Game(new HumanPlayerStrategy(),new HumanPlayerStrategy(), 5);
        tikTacToeGame.play();
    }
}
