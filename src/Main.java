import designPatterns.strategyDesignPattern.withStrategyDesignPattern.PassengerVehicle;
import designPatterns.strategyDesignPattern.withStrategyDesignPattern.SportsVehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Strategy Design Pattern
        // Create a vehicle with a specific driving strategy
        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
        // Output: Special driving
        PassengerVehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
        // Output: Normal driving

    }
}