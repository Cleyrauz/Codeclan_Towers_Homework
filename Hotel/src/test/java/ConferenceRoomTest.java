import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1, guest2, guest3, guest4;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom(3, "La Orchila", 40);
        guest1 = new Guest("Cleyra", 100, 1);
        guest2 = new Guest("Roddy", 50.5, 1);
        guest3 = new Guest("Jose", 70.80, 2);
        guest4 = new Guest("Jaime", 100, 3);
    }

    @Test
    public void testHasAName(){
        assertEquals("La Orchila", conferenceRoom.getName());
    }


    @Test
    public void testHasACapacity(){
        assertEquals(3, conferenceRoom.getCapacity());
    }

    @Test
    public void testHasADailyRate(){
        assertEquals(40, conferenceRoom.getDailyRate());
    }

    @Test
    public void testCheckIn(){
      conferenceRoom.checkIn(guest1);
      conferenceRoom.checkIn(guest2);
      assertEquals(2, conferenceRoom.getGuests().size());
    }

    @Test
    public void testCanNotDoCheckInIfFull(){
        conferenceRoom.checkIn(guest1);
        conferenceRoom.checkIn(guest2);
        conferenceRoom.checkIn(guest3);
        conferenceRoom.checkIn(guest4);
        assertEquals(3, conferenceRoom.getGuests().size());
    }

    @Test
    public void testCheckOut(){
        conferenceRoom.checkIn(guest1);
        conferenceRoom.checkOut(guest1);
        assertEquals(0, conferenceRoom.getGuests().size());
    }

    @Test
    public void testHasBalance(){
        assertEquals(0, conferenceRoom.getBalance(), 0);
    }

    @Test
    public void testGuestCanAffordTheRoom(){
        guest2.pay(conferenceRoom.getDailyRate());
        assertEquals(10.5, guest2.getPocketMoney(), 0);
    }

    @Test
    public void testCanNotAffordTheRoom(){
        guest1.pay(conferenceRoom.getDailyRate());
        assertEquals(0, conferenceRoom.getGuests().size());
    }

    @Test
    public void testConferenceRoomHasGreetings(){
        assertEquals("Welcome to the ConferenceRoom!", conferenceRoom.getGreetings());
    }
}
