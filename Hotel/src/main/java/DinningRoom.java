public class DinningRoom extends Room {

    private String name;

    public DinningRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGreetings() {
        return "Welcome to The Dinner House!";
    }
}
