import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;
    Bedroom bedroom;

    @Before
    public void setUp(){
        guest = new Guest("Adri White", 50.5, 1);
        bedroom = new Bedroom(1, 20, RoomType.SINGLE, 4554);
    }

    @Test
    public void testGuestHasAName(){
        assertEquals("Adri White", guest.getName());
    }

    @Test
    public void testGuestHasPocketMoney(){
        assertEquals(50.5, guest.getPocketMoney(), 0);
    }

    @Test
    public void testGuestCanPay(){
        guest.pay(bedroom.getNightlyRate());
       assertEquals(30.5, guest.getPocketMoney(), 0);
    }
    @Test
    public void testHasNumberOfNights(){
        assertEquals(1, guest.getNumberOfNights());
    }
    @Test
    public void guestHasAKey(){
        guest.setKey(1234);
        assertEquals(1234, guest.getKey());
    }
}
