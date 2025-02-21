package src;

public enum RoomType {
    SINGLE(2000, 50, 1),
    STANDARD_DOUBLE(5000, 100, 2),
    STANDARD_TWIN(6000, 120, 2),
    DELUXE_ROOM(12000, 200, 2),
    STUDIO_APARTMENT(18000, 300, 2),
    JUNIOR_SUITE(30000, 500, 3),
    EXECUTIVE_SUITE(70000, 1000, 4),
    PRESIDENTIAL_SUITE(200000, 5000, 6);

    private final int propertyPrice;
    private final int rentPerNight;
    private final int capacity;

    RoomType(int propertyPrice, int rentPerNight, int capacity) {
        this.propertyPrice = propertyPrice;
        this.rentPerNight = rentPerNight;
        this.capacity = capacity;
    }

    public int getPropertyPrice() {
        return propertyPrice;
    }

    public int getRentPerNight() {
        return rentPerNight;
    }

    public int getCapacity() {
        return capacity;
    }
}
