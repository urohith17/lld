import java.util.*;

public class ParkingLot{
    private static ParkingLot instance = null;
    public static double collectedAmount = 0;
    private List<ParkingSpace> spaces;
    private ParkingLot(){
        instance = this;
        this.spaces  = new ArrayList<>();
    }

  public static ParkingLot getInstance(){
        if(instance == null) return new ParkingLot();
        else return instance;
  }

  public void addParkingSpace(ParkingSpace space){
        this.spaces.add(space);
  }
  public void printCollectedAmount(){
       System.out.println(collectedAmount);
  }

  public Ticket parkVehicle(Vehicle vehicle) throws Exception{
        Ticket ticket = null;
        for(ParkingSpace space:spaces){
            if(space.isParkingSpotAvailable()){
               ticket =  space.allocateSpot(vehicle);
               break;
            }
        }
        if(ticket == null){
            throw new Exception("No slots available");
        }
        return ticket;
  }
  
  public Ticket parkVehicle(Vehicle vehicle,int index) throws Exception {
      Ticket ticket = null;

          if (spaces.get(index).isParkingSpotAvailable()) {
              ticket = spaces.get(index).allocateSpot(vehicle);
          }
      if (ticket == null) {
          throw new Exception("No slots available");
      }
      return ticket;
  }

}