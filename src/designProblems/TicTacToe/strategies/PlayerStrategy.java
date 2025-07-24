package designProblems.TicTacToe.strategies;

import designProblems.TicTacToe.util.Board;
import designProblems.TicTacToe.util.Player;
import designProblems.TicTacToe.util.Position;

public interface PlayerStrategy {
    Position makeMove(Board board, Player player);
}
