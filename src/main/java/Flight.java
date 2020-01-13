import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String number;
    private LocationType departure;
    private LocationType destination;
    private String departureTime;

    public Flight(Plane plane, String number, LocationType departure, LocationType destination, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.number = number;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public int getPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

//    public String getNumber() {
//        return number;
//    }
//
//    public String getDeparture() {
//        return departure.getShortHand();
//    }
//
//    public String getDestination() {
//        return destination.getShortHand();
//    }
//
//    public String getDepartureTime() {
//        return departureTime;
//    }
//
//    public void addPassenger(Passenger passenger1) {
//        if (returnFreeSeats() >= 1){
//            this.passengers.add(passenger1);
//        }
//    }
//
//    public int returnFreeSeats() {
//        return plane.getCapacityFromPlaneType() - getPassengers();
//    }
}
