import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Andrew", 2);
    }

    @Test
    public void getsPassengerName() {
        assertEquals("Andrew", passenger1.getName());
    }

    @Test
    public void getsPassengerNumberOfBags() {
        assertEquals(2, passenger1.getBags());
    }


}
