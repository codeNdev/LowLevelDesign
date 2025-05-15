package designProblems.parkingLotDesign;

import designProblems.parkingLotDesign.strategy.pricing.HourlyPricingStrategy;
import designProblems.parkingLotDesign.strategy.pricing.PricingStrategy;
import designProblems.parkingLotDesign.factory.PricingStrategyFactory;
import java.time.LocalDateTime;

class ExitGate {
    private String gateId;

    public double processExit(Ticket ticket) {
        LocalDateTime exitTime = LocalDateTime.now();

        PricingStrategy pricingStrategy = PricingStrategyFactory.getPricingStrategy("hourly");
        CostCalculation costCalc = new CostCalculation(pricingStrategy);

        double amount = costCalc.calculate(ticket, exitTime);

        // Update database, mark slot free, generate receipt etc.
        ticket.getParkingSpot().unpark();

        return amount;
    }
}

