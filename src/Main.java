import designPatterns.strategyDesignPattern.withStrategyDesignPattern.PassengerVehicle;
import designPatterns.strategyDesignPattern.withStrategyDesignPattern.SportsVehicle;
import designProblems.snakeLadder.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Strategy Design Pattern
        // Create a vehicle with a specific driving strategy
//        SportsVehicle sportsVehicle = new SportsVehicle();
//        sportsVehicle.drive();
        // Output: Special driving
//        PassengerVehicle passengerVehicle = new PassengerVehicle();
//        passengerVehicle.drive();
        // Output: Normal driving
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");
        Deque<Player> players =new ArrayDeque<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        // Create a board with a specific size
        // Create a game with the board and players
        List<Snake> snakes = List.of(new Snake(14, 7), new Snake(22, 11), new Snake(28, 1),
                new Snake(36, 6), new Snake(51, 30), new Snake(71, 91), new Snake(78, 98));
        List<Ladder> ladders = List.of(new Ladder(3, 22), new Ladder(11, 26),
                new Ladder(20, 29), new Ladder(27, 1), new Ladder(39, 59), new Ladder(53, 67),
                new Ladder(63, 81), new Ladder(75, 91));
        // Create a dice
        Dice dice = new Dice(6);
        Game game = new Game(new Board(100), players, snakes, ladders, dice);
        // Play the game
        game.play();

    }
}