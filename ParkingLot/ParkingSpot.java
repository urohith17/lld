import java.util.*;

public class ParkingSpot implements ISpot {
   UUID id;
   Vehicle vehicle;
   IPrice price;
   boolean isAllocated = false;
   
    ParkingSpot(){
        this.id = UUID.randomUUID();
    }
  public void  addVehicle(Vehicle vehicle){
        if(this.vehicle == null){
            this.vehicle = vehicle;
        }
  }
  

  public boolean getIsAllocated() {
      return isAllocated;
  }

  public void allocate() {
      this.isAllocated = true;
  }
  public void removeVehicle(Vehicle v) {
        this.vehicle = null;
  }

  public Vehicle getVehicle(){
    return null;
  }
  @Override
  public UUID getID() {
      // TODO Auto-generated method stub
      return null;
  }
  @Override
  public IPrice getPrice() {
      // TODO Auto-generated method stub
      return null;
  }
  void setPrice(IPrice price){
        this.price = price;
  }
  public double calculatePrice(long time){
    return this.price.getPrice(time);
  }
}
