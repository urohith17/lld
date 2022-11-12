public class StartProgram {
   
    public static void main(String[] args) {
        ParkingLot lot = ParkingLot.getInstance();
        ParkingSpace space = new ParkingSpace(10);
        lot.addParkingSpace(space);
        Customer customer = new Customer("hello");
        
        Vehicle vehicle = new Vehicle("12345", "black","tata");
        customer.vehicle = vehicle;
        try{
            customer.parkVehicle(lot.parkVehicle(vehicle));
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
