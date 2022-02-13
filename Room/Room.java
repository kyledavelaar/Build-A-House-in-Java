package Room;

public abstract class Room {
    String type;
    Double width;
    Double length;
    Integer windowCount;

    public Room(String type, Double width, Double length, Integer windowCount) {
        this.type = type;
        this.width = width;
        this.length = length;
        this.windowCount = windowCount;
    }

    public String toString() {
        return "type: " + type + "\nwidth: " + width + "\nheight: " + length;
    }

}
