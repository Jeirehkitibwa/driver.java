package utms.encapsulation;

public class Vehicle {
    private String vehicleId;
    private String model;
    private int capacity;

    public Vehicle(String vehicleId, String model, int capacity) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.capacity = capacity;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        }
    }
}