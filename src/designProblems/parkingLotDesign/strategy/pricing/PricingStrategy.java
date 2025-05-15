package designProblems.parkingLotDesign.strategy.pricing;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double calculateFare(LocalDateTime in, LocalDateTime out);
}
