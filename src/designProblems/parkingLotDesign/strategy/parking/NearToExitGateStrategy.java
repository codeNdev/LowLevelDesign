package designProblems.parkingLotDesign.strategy.parking;

import designProblems.parkingLotDesign.ParkingSpot;
import designProblems.parkingLotDesign.Vehicle;

public class NearToExitGateStrategy implements ParkingStrategy {

    @Override
    public boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {
        return false;
    }

    @Override
    public void unParkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {

    }

    @Override
    public boolean isParkingAvailable(ParkingSpot parkingSpot) {
        return false;
    }
}
