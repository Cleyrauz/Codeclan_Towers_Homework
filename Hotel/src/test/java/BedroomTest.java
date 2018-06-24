import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1, guest2;

    @Before
    public void setUp(){
      bedroom = new Bedroom(1, 20, RoomType.SINGLE);
      guest1 = new Guest("Roddy", 500.5, 3);
      guest2 = new Guest("Cleyra", 10, 1);
    }

    @Test
    public void testHasANumber(){
       assertEquals(1, bedroom.getNumber());
    }

    @Test
    public void testHasANightlyRate(){
        assertEquals(20, bedroom.getNightlyRate(), 0);
    }

    @Test
    public void testHasARoomType(){
        assertEquals("Single", bedroom.getTypeRoom());
    }

    @Test
    public void testCheckIn(){
       bedroom.checkIn(guest1);
       assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void testCanNotCheckInWhenRoomIsFull(){
        bedroom.checkIn(guest1);
        bedroom.checkIn(guest2);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals("Roddy", bedroom.getGuests().get(0).getName());
    }

    @Test
    public void testCheckOut(){
        bedroom.checkIn(guest1);
        bedroom.checkOut(guest1);
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void testGuestCanAffordTheRoom(){
        bedroom.checkIn(guest1);
        assertEquals(480.5, guest1.getPocketMoney(), 0);
    }

    @Test
    public void testHasABalance(){
        assertEquals(0, bedroom.getBalance(), 0);
    }

    @Test
    public void testGuestCanNotAffordTheRoom(){
      guest2.pay(bedroom.getNightlyRate());
      assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void testBedroomHasGreetings(){
        assertEquals("Welcome to our Bedroom! Have a good night.", bedroom.getGreetings());
    }

}
