
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private Guest guest;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests(){
        return guests;
    }

    public void checkIn(Guest guest){
        if(this.capacity > this.guests.size()){
          guests.add(guest);
        }
    }

    public void checkOut(Guest guest) {
        this.guests.remove(guest);
    }
}