public class ConferenceRoom extends Room {

    private String name;
    private int dailyRate;

    public ConferenceRoom(int capacity, String name, int dailyRate) {
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;

    }

    public String getName() {
        return name;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    @Override
    public void checkIn(Guest guest) {
        if(guest.getPocketMoney() >= this.dailyRate){
            super.checkIn(guest);
            guest.pay(dailyRate);
        }
        else System.out.println("Guest can't afford the room");
    }

    public String getGreetings() {
        return "Welcome to the ConferenceRoom!";
    }

}
