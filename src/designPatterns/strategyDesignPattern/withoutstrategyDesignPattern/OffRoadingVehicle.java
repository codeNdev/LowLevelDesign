package designPatterns.strategyDesignPattern.withoutstrategyDesignPattern;

public class OffRoadingVehicle extends Vehicle {
    @Override
    void drive() {
        System.out.println("Special driving");
    }
}
