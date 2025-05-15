package designProblems.parkingLotDesign.strategy.parking;

import designProblems.parkingLotDesign.ParkingSpot;
import designProblems.parkingLotDesign.Vehicle;

public class ParkNearToEntryGateStrategy implements ParkingStrategy {
    @Override
    public boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingLot) {
        // Logic to park the vehicle near the entry gate
        System.out.println("Parking " + vehicle.getVehicleType() + " near the entry gate.");
        // Implement the actual parking logic here
        return true;
    }

    @Override
    public void unParkVehicle(Vehicle vehicle, ParkingSpot parkingSpot) {

    }

    @Override
    public boolean isParkingAvailable(ParkingSpot parkingSpot) {
        return false;
    }

}
