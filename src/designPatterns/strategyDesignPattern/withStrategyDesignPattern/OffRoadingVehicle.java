package designPatterns.strategyDesignPattern.withStrategyDesignPattern;

import designPatterns.strategyDesignPattern.withStrategyDesignPattern.strategy.SpecialDriving;

public class OffRoadingVehicle extends Vehicle {
    public OffRoadingVehicle() {
        super(new SpecialDriving());
    }
}
