
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private Guest guest;
    private double balance;
    private String greetings;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.balance = 0;
        this.greetings = greetings;
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

    public String getGreetings() {
        return "Welcome to Hotel CodeClan Tower!";
    }
}