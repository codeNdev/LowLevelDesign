package designPatterns.strategyDesignPattern.withStrategyDesignPattern;
import designPatterns.strategyDesignPattern.withStrategyDesignPattern.strategy.NormalDriving;

public class NormalVehicle extends Vehicle {
    public NormalVehicle() {
        super(new NormalDriving());
    }
}
