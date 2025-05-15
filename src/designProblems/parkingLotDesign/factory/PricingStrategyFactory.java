package designProblems.parkingLotDesign.factory;

import designProblems.parkingLotDesign.strategy.pricing.HourlyPricingStrategy;
import designProblems.parkingLotDesign.strategy.pricing.MinutePricingStrategy;
import designProblems.parkingLotDesign.strategy.pricing.PricingStrategy;

public class PricingStrategyFactory {
    public static PricingStrategy getPricingStrategy(String type) {
        switch (type.toLowerCase()) {
            case "hourly": return new HourlyPricingStrategy();
            case "minute": return new MinutePricingStrategy();
            default: throw new IllegalArgumentException("Unknown pricing type");
        }
    }
}

