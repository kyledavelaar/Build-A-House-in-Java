import Room.*;
import TemperatureManager.TemperatureManager;
import java.util.*;

class House {
    public static void main(String [] args) {
        TemperatureManager tm = new TemperatureManager();
        Kitchen kitchen = new Kitchen("kitchen", 12.0, 11.0, 3, 1);
        String[] dishes = {"plate", "bowl"};
        String message = kitchen.washDishes(dishes);
        print(message);
        print(kitchen);
        tm.setRoomTemperature(kitchen, 72);
        Integer roomTemp = tm.getRoomTemperature(kitchen);
        print("kitchen temp is " + roomTemp);

    }

    private static void print(Object message) {
        System.out.println(message.toString());
    }
}