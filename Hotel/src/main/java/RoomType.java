public enum RoomType {


    SINGLE(1, "Single"),
    DOUBLE(2, "Double"),
    SUITE(2, "Suite"),
    FAMILY(4, "Family");

    private final int value;
    private final String name;

    RoomType(int value, String name) {
        this.value = value;
        this.name = name;

    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
