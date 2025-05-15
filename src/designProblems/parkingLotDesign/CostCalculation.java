package designProblems.parkingLotDesign;

import designProblems.parkingLotDesign.strategy.pricing.PricingStrategy;

import java.time.LocalDateTime;

class CostCalculation {
    private final PricingStrategy pricingStrategy;

    public CostCalculation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculate(Ticket ticket, LocalDateTime exitTime) {
        return pricingStrategy.calculateFare(ticket.getEntryTime(), exitTime);
    }
}

