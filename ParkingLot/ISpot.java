import java.util.UUID;

public interface ISpot {
    void addVehicle(Vehicle vehicle);
    void removeVehicle(Vehicle vehicle);
    Vehicle getVehicle();
    UUID getID();
    IPrice getPrice();
    double calculatePrice(long time);
    boolean getIsAllocated();
    void allocate();
}
