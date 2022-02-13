package TemperatureManager;

import java.util.*;
import Room.Room;

public class TemperatureManager {
    private Map<Room, Integer> temperatures = new HashMap<>();

    public void setRoomTemperature(Room room, Integer temperature) {
        temperatures.put(room, temperature);
    }

    public Integer getRoomTemperature(Room room) {
        if (temperatures.containsKey(room)) {
            return temperatures.get(room);
        } else {
            throw new Error("Must first set room temperature");
        }
    }
}
