/**
 * Ticket
 */
public class Ticket {
        Vehicle vehicle;
        ISpot spot;
        long time;

        Ticket(Vehicle vehicle, ISpot spot, long time) {
            this.vehicle = vehicle;
            this.spot = spot;
            this.time = time;
        }

        public void printTicket() {
            System.out.print(vehicle.registrationNumber);
            System.out.print(spot.getID());
            System.out.println(time);
        }

        public void collectTicket() {
            ParkingLot.collectedAmount = +spot.calculatePrice(time);
        }

}