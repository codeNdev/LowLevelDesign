package designPatterns.strategyDesignPattern.withStrategyDesignPattern;

import designPatterns.strategyDesignPattern.withStrategyDesignPattern.strategy.SpecialDriving;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SpecialDriving());
    }
}
