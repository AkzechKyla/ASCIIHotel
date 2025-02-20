package src;

public enum RoomType {
    SINGLE(50, 1),
    STANDARD_DOUBLE(100, 2),
    STANDARD_TWIN(120, 2),
    DELUXE_ROOM(200, 2),
    STUDIO_APARTMENT(300, 2),
    JUNIOR_SUITE(500, 3),
    EXECUTIVE_SUITE(1000, 4),
    PRESIDENTIAL_SUITE(5000, 6);

    private final int pricePerNight;
    private final int capacity;

    RoomType(int pricePerNight, int capacity) {
        this.pricePerNight = pricePerNight;
        this.capacity = capacity;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public int getCapacity() {
        return capacity;
    }
}
