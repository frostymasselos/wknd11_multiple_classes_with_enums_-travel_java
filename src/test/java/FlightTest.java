import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight1;
    private Plane plane1;
    private Passenger passenger1;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BOEING747);
        flight1 = new Flight(plane1, "FR756", LocationType.EDINBURGH, LocationType.PARIS, "17:00");
        passenger1 = new Passenger("Abby", 2);
    }

    @Test
    public void getsPassengers(){
        assertEquals(0, flight1.getPassengers());
    }

    @Test
    public void getsPlane(){
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void getsFlightNumber(){
        assertEquals("FR756", flight1.getNumber());
    }

    @Test
    public void getsDeparture(){
        assertEquals("PAR", flight1.getDestination());
    }

    @Test
    public void getsDestination(){
        assertEquals("EDI", flight1.getDeparture());
    }

    @Test
    public void getsTimeOfDeparture(){
        assertEquals("17:00", flight1.getDepartureTime());
    }

    @Test
    public void addOnePassengerToFlight(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getPassengers());
    }

    @Test
    public void wontAddPassenger__WhenFull(){
        for (int i = 0; i < flight1.getPlane().getCapacityFromPlaneType() + 1; i++) {
            flight1.addPassenger(passenger1);
        }
        assertEquals(660, flight1.getPassengers());
    }

    @Test
    public void returnsNumberOfFreeSeats__WhenEmpty(){
        assertEquals(660, flight1.returnFreeSeats());
    }

    @Test
    public void returnsNumberOfFreeSeats__WhenLoaded(){
        flight1.addPassenger(passenger1);
        assertEquals(659, flight1.returnFreeSeats());
    }

}

