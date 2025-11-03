package org.cw4.lasse_objects_statics_non_static.rooms;

import org.cw4.lasse_objects_statics_non_static.constans.rooms.GeneralTimeConstants;
import org.cw4.lasse_objects_statics_non_static.utils.PrintToConsole;

import static org.cw4.lasse_objects_statics_non_static.constans.rooms.GeneralTimeConstants.*;

public class Room {
    private String nameOfRoom;
    private double width, length;
    private int numberOfWindows, numberOfFurniture;
    private double areaOfRoom;

    public Room(double width, double length) {
        this.width = width;
        this.length = length;
        this.nameOfRoom = "Default room";
        numberOfWindows = 1;
        numberOfFurniture = 1;
        areaOfRoom = width * length;
    }

    public Room(String nameOfRoom, double width, double length, int numberOfWindows, int numberOfFurniture) {
        this.nameOfRoom = nameOfRoom;
        this.width = width;
        this.length = length;
        this.numberOfWindows = numberOfWindows;
        this.numberOfFurniture = numberOfFurniture;
        areaOfRoom = width * length;

    }

    public double getAreaOfRoom() {
        return areaOfRoom;
    }

    private double timeForVacuumCleanerAndMop() {
        return this.areaOfRoom * (TIME_FOR_VACUUM_CLEANER + TIME_FOR_MOP);
    }

    public double timeForVacuumCleanerAndMopAndPrint() {
        double tempTime = timeForVacuumCleanerAndMop();
        System.out.println(nameOfRoom + ": Time for vacuum cleaning and Mop = " + tempTime);
        return tempTime;
    }

    public double totalTimeForCleaningAndPrint() {
        double totalTime = timeForVacuumCleanerAndMop() + (TIME_FOR_CLEANING_WINDOW * this.numberOfWindows) +
                TIME_FOR_WIPE_THE_DUST * this.numberOfFurniture;
        System.out.println("nameOfRoom:");
       // System.out.println("Total time " + totalTime);
        PrintToConsole.printTotalValueLikeHeader(String.valueOf(totalTime));
        return totalTime;
    }
}
