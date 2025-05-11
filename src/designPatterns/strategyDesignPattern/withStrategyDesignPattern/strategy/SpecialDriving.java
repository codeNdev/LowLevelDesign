package designPatterns.strategyDesignPattern.withStrategyDesignPattern.strategy;

public class SpecialDriving implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Special driving");
    }
}
