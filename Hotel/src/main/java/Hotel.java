import java.util.ArrayList;

public class Hotel extends Room {

    private ArrayList<Room> listRooms;
    private Guest guest;

    public Hotel(int capacity) {
        super(capacity);
        this.listRooms = new ArrayList<Room>();
        this.guest = guest;
    }

    public void addRoom(Room room){
        this.listRooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return listRooms;
    }

    public ArrayList vacantRooms(){
        ArrayList<Room> freeRooms = new ArrayList<Room>();
        for(Room room : listRooms){
            if(room.getGuests().size() == 0){
                freeRooms.add(room);
            }
        }

        return freeRooms;
    }
}
