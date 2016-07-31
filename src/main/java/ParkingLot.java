import java.util.ArrayList;

/**
 * Created by zhiwang on 3/24/16.
 */
public class ParkingLot {

    private int capacity;
    private ArrayList<ParkingTicket> validParkingTickets;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.validParkingTickets = new ArrayList<>();
    }

    public ParkingTicket park() {
        if (this.validParkingTickets.size() >= this.capacity) {
            return null;
        } else {
            ParkingTicket parkingTicket = new ParkingTicket();
            this.validParkingTickets.add(parkingTicket);
            return parkingTicket;
        }
    }

    public Car getCar(ParkingTicket parkingTicket) throws InvalidTicket {
        if (validParkingTickets.indexOf(parkingTicket) == -1) {
            throw new InvalidTicket();
        }
        validParkingTickets.remove(validParkingTickets.indexOf(parkingTicket));
        return new Car();
    }

    public ArrayList<ParkingTicket> getValidParkingTickets() {
        return validParkingTickets;
    }
}
