import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private double nightlyRate;
    private RoomType room;
    private int numbersOfNights;

    public Bedroom(int number, double nightlyRate, RoomType room, int numbersOfNights) {
        super(room.getValue());
        this.number = number;
        this.nightlyRate = nightlyRate;
        this.room = room;
        this.numbersOfNights = 3;
    }

    public int getNumber() {
        return number;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public String getTypeRoom() {
        return room.getName();
    }

    @Override
    public void checkIn(Guest guest) {
        if(guest.getPocketMoney() >= this.nightlyRate){
            super.checkIn(guest);
            super.addBalance(nightlyRate);
            guest.pay(nightlyRate);
        }
        else System.err.println("Guest can't afford the room");
    }

    public int getNumbersOfNights(){
       return this.numbersOfNights;
    }
}
