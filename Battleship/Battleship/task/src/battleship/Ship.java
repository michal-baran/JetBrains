package battleship;

public enum Ship {
    AircraftCarrier("Aircraft Carrier",5, 5),
    Battleship("Battleship",4, 4),
    Submarine("Submarine",3, 3),
    Cruiser("Cruiser",2, 3),
    Destroyer("Destroyer",1, 2);

    String name;
    int order;
    int size;

    Ship(String name, int order, int size) {
        this.name = name;
        this.order = order;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public static Ship findByOrder(int order) {
        for (Ship value : values()) {
            if (order == (value.order)) {
                return value;
            }
        }
        return null;
    }
}