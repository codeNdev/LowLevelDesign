package designPatterns.strategyDesignPattern.withStrategyDesignPattern;

import designPatterns.strategyDesignPattern.withStrategyDesignPattern.strategy.NormalDriving;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriving());
    }
}
