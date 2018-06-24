import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private double nightlyRate;
    private RoomType room;


    public Bedroom(int number, double nightlyRate, RoomType room) {
        super(room.getValue());
        this.number = number;
        this.nightlyRate = nightlyRate;
        this.room = room;
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
        if(guest.getPocketMoney() >= this.nightlyRate * guest.getNumberOfNights()){
            super.checkIn(guest);
            super.addBalance(nightlyRate);
            guest.pay(nightlyRate);
        }
        else System.err.println("Guest can't afford the room");
    }

}
