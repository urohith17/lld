import java.util.UUID;

public class Customer {
    Ticket ticket;
    String name;
    Vehicle vehicle;
    UUID id = UUID.randomUUID();
    Customer(String name){
        this.name=name;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
   public void parkVehicle(Ticket ticket){
            this.ticket= ticket;
            ticket.spot.addVehicle(vehicle);
    }
    public Ticket exitLot(){
            return ticket;
    }
    
}
