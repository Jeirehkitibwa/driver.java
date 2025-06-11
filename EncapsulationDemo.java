package utms.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create instances
        Driver driver = new Driver("D001", "Mike Ross", "L12345");
        Vehicle vehicle = new Vehicle("V001", "Bus Model X", 50);
        UserCredentials credentials = new UserCredentials("john_doe", "securepass");

        // Access data using getters
        System.out.println("Driver: " + driver.getName() + ", License: " + driver.getLicenseNumber());
        System.out.println("Vehicle: " + vehicle.getModel() + ", Capacity: " + vehicle.getCapacity());
        System.out.println("User: " + credentials.getUsername() + ", Password: " + credentials.getPassword());

        // Modify data using setters
        driver.setLicenseNumber("L67890");
        vehicle.setCapacity(60);
        credentials.setPassword("newpass");

        // Display updated data
        System.out.println("\nUpdated Driver License: " + driver.getLicenseNumber());
        System.out.println("Updated Vehicle Capacity: " + vehicle.getCapacity());
        System.out.println("Updated Password: " + credentials.getPassword());
    }
}