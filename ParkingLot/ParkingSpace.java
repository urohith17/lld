import java.util.*;

public class ParkingSpace{
    List<ISpot> spots;
    int occupied = 0;
    int size = 0;
    ParkingSpace(int size){
        this.size = size;
    }

   public void  addSpot(ISpot spot){
        spots.add(spot);
   }
   public boolean isParkingSpotAvailable(){
        return occupied < size;
   }
   public Ticket allocateSpot(Vehicle vehicle){
        for(ISpot spot:spots){
            if(!spot.getIsAllocated()){
                spot.allocate();
                Ticket ticket = new Ticket(vehicle,spot,System.currentTimeMillis());
                return ticket;
            }
        }
        return null;
   }
}
