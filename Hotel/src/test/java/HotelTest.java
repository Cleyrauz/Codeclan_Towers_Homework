import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    ArrayList<Room> rooms;
    ArrayList<Guest> guestsList;
    Guest guest1, guest2, guest3;
    Bedroom bedroom1, bedroom2, bedroom3, bedroom4;
    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<Room> freeRooms;


    @Before
    public void setUp() {
        rooms = new ArrayList<Room>();
        guest1 = new Guest("Claire", 300);
        guest2 = new Guest("Paul", 250.5);
        guest3 = new Guest("Josh", 450);
        bedroom1 = new Bedroom(1, 60, RoomType.FAMILY, 1);
        bedroom2 = new Bedroom(2, 20, RoomType.SINGLE, 1);
        bedroom3 = new Bedroom(3, 30, RoomType.SUITE, 1);
        bedroom4 = new Bedroom(4, 40, RoomType.DOUBLE,1);
        hotel = new Hotel(4);
        bedrooms = new ArrayList<Bedroom>();
        freeRooms = new ArrayList<Room>();

    }

    @Test
    public void testShowAListOfGuestsByRoom(){
        guestsList = new ArrayList<Guest>();
        guestsList.add(guest1);
        guestsList.add(guest2);
        guestsList.add(guest3);
        bedroom1.checkIn(guest1);
        bedroom1.checkIn(guest2);
        bedroom1.checkIn(guest3);
        assertEquals(guestsList, bedroom1.getGuests());
    }

    @Test
    public void testHotelHasBedrooms(){
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(bedroom3);
        hotel.addRoom(bedroom4);
        assertEquals(4, hotel.getRooms().size());
    }

    @Test
    public void testHasVacantRoom(){
        freeRooms = new ArrayList<Room>();
        bedroom1.checkIn(guest3);
        freeRooms.add(bedroom2);
        freeRooms.add(bedroom3);
        freeRooms.add(bedroom4);
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(bedroom3);
        hotel.addRoom(bedroom4);
        assertEquals(freeRooms, hotel.vacantRooms());
    }

    @Test
    public void testHasNumbersOfNights(){
        assertEquals(3, bedroom1.getNumbersOfNights());
    }

}
