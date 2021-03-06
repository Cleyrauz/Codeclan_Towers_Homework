import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

    DinningRoom dinningRoom;
    Guest guest, guest2, guest3, guest4;

    @Before
    public void setUp(){
      dinningRoom = new DinningRoom(2, "The Dinner House", 1234);
      guest = new Guest("Cleyra", 10, 1);
      guest2 = new Guest("Jose", 10, 1);
      guest3 = new Guest("Julio", 10, 1);
      guest4 = new Guest("Maria", 10, 1);
    }

    @Test
    public void testHasAName(){
        assertEquals("The Dinner House", dinningRoom.getName());
    }

    @Test
    public void testHasACapacity(){
        assertEquals(2, dinningRoom.getCapacity());
    }

    @Test
    public void testCheckIn(){
        dinningRoom.checkIn(guest);
        assertEquals(1, dinningRoom.getGuests().size());
    }

    @Test
    public void testCanNotCheckInWhenIsFull(){
        dinningRoom.checkIn(guest);
        dinningRoom.checkIn(guest2);
        dinningRoom.checkIn(guest3);
        dinningRoom.checkIn(guest4);
        assertEquals(2, dinningRoom.getGuests().size());
    }

    @Test
    public void testDinningRoomHasGreetings(){
        assertEquals("Welcome to The Dinner House!", dinningRoom.getGreetings());
    }

    @Test
    public void testGuestHasAccess(){
        guest.setKey(1234);
        assertEquals(true, dinningRoom.guestHasAccess(guest));
    }
}
