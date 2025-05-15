package designProblems.parkingLotDesign.strategy.pricing;

import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyPricingStrategy implements PricingStrategy {
    private static final double RATE_PER_HOUR = 30;

    @Override
    public double calculateFare(LocalDateTime in, LocalDateTime out) {
        long hours = Duration.between(in, out).toHours();
        return Math.max(1, hours) * RATE_PER_HOUR;
    }
}
