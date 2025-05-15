package designProblems.parkingLotDesign;

public class ParkingSpot {
    private int id;
    private boolean isOccupied;
    private Vehicle vehicle;
    private int hourlyCharge;
    private VehicleType vehicleType;
    public ParkingSpot(){

    }
    public ParkingSpot(int id, VehicleType vehicleType, int hourlyCharge) {
        this.id = id;
        this.isOccupied = false;
        this.hourlyCharge = hourlyCharge;
        this.vehicleType = vehicleType;
    }
    public void parkVehicle(Vehicle vehicle){
        // Logic to park the vehicle
        if (!isOccupied && vehicle.getVehicleType() == this.vehicleType) {
            isOccupied = true;
            this.vehicle=vehicle;
            vehicle.setParked(true);
        } else {
            System.out.println("Parking spot is already occupied or Vehicle type mismatch.");
        }
    }
    public void unpark(){
        // Logic to remove the vehicle
        if (isOccupied) {
            isOccupied = false;
            vehicle.setParked(false);
            Vehicle res=vehicle;
            vehicle = null;
        } else {
            System.out.println("Parking spot is already empty.");
        }
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
