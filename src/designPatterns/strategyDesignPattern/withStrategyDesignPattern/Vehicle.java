package designPatterns.strategyDesignPattern.withStrategyDesignPattern;

import designPatterns.strategyDesignPattern.withStrategyDesignPattern.strategy.DrivingStrategy;

public class Vehicle {
    DrivingStrategy drivingStrategy;
    public Vehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
    public void drive() {
        drivingStrategy.drive();
    }
}
