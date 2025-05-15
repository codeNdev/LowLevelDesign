package designProblems.parkingLotDesign.strategy.pricing;

import java.time.Duration;
import java.time.LocalDateTime;

public class MinutePricingStrategy implements PricingStrategy {
    private static final double RATE_PER_MINUTE = 0.5;  // ₹0.5 per minute

    @Override
    public double calculateFare(LocalDateTime in, LocalDateTime out) {
        long minutes = Duration.between(in, out).toMinutes();
        return Math.max(1, minutes) * RATE_PER_MINUTE;
    }
}

