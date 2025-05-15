package designProblems.parkingLotDesign.strategy.parking;

import designProblems.parkingLotDesign.ParkingSpot;
import designProblems.parkingLotDesign.Vehicle;

public interface ParkingStrategy {
    boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot);

    void unParkVehicle(Vehicle vehicle, ParkingSpot parkingSpot);

    boolean isParkingAvailable(ParkingSpot parkingSpot);
}
