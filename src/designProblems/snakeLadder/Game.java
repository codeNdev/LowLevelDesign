package designProblems.snakeLadder;

import java.util.Deque;
import java.util.List;

public class Game {
    private Board board;
    private Deque<Player> players;
    private Dice  dice;
    public Game(Board board, Deque<Player> players, List<Snake> snakes, List<Ladder> ladders,Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        for (Snake snake : snakes) {
            board.getCells()[snake.getFrom()].setSnake(snake);
        }
        for (Ladder ladder : ladders) {
            board.getCells()[ladder.getFrom()].setLadder(ladder);
        }
    }

    public void play() {
        while (players.size()>1) {
            Player currentPlayer = players.poll();
            int currentValue=dice.roll();
            int newPosition = currentPlayer.getPosition() + currentValue;
            System.out.println(currentPlayer.getName() + " rolled a " + currentValue + " and moved to " + newPosition);
            if (newPosition > board.getSize()) {
                System.out.println(currentPlayer.getName() + " rolled too high and stays at " + currentPlayer.getPosition());
                players.offer(currentPlayer); // add the player back to the queue
//                do nothing
            } else {
                Cell cell = board.getCells()[newPosition];
                if (cell.getSnake() != null) {
                    newPosition = cell.getSnake().getTo();
                } else if (cell.getLadder() != null) {
                    newPosition = cell.getLadder().getTo();
                }
                currentPlayer.setPosition(newPosition);
                if (newPosition == board.getSize()) {
                    System.out.println(currentPlayer.getName() + " wins!");
                }else {
                    players.offer(currentPlayer);
                }
            }

        }
        System.out.println("Game Over");
    }
}
