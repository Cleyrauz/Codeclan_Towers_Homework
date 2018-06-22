import java.util.ArrayList;

public class Bedroom extends Room {

    private int number;
    private int nightlyRate;
    private RoomType room;

    public Bedroom(int number, int nightlyRate, RoomType room) {
        super(room.getValue());
        this.number = number;
        this.nightlyRate = nightlyRate;
        this.room = room;
    }

    public int getNumber() {
        return number;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public String getTypeRoom() {
        return room.getName();
    }

}
