
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private Guest guest;
    private double balance;
    protected int password;

    public Room(int capacity, int password) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.balance = 0;
        this.password = password;
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

    protected void addBalance(double nightlyRate) {
       this.balance += nightlyRate;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getGreetings();

    public boolean guestHasAccess(Guest guest){
        if(guest.getKey() == this.password){
            return true;
        }
        return false;
    }
}