package org.cw4.lasse_objects_statics_non_static;

import org.cw4.lasse_objects_statics_non_static.constans.rooms.GeneralTimeConstants;
import org.cw4.lasse_objects_statics_non_static.rooms.Room;

public class CalculationTimeForCleaning {
    public static void main(String[] args) {
        System.out.println(GeneralTimeConstants.TIME_FOR_CLEANING_WINDOW);
        Room livingRoom=new Room("Living room",2.5,3.5,2,3);
        System.out.println(livingRoom.getAreaOfRoom());
        Room bedRoom=new Room("Bed room",3,5.6,4,15);
        System.out.println(bedRoom.getAreaOfRoom());
        Room defaultRoom=new Room(2,3);
        System.out.println(defaultRoom.getAreaOfRoom());
        livingRoom.timeForVacuumCleanerAndMopAndPrint();
        defaultRoom.timeForVacuumCleanerAndMopAndPrint();
        livingRoom.totalTimeForCleaningAndPrint();
        bedRoom.totalTimeForCleaningAndPrint();
        defaultRoom.totalTimeForCleaningAndPrint();
        double time=livingRoom.timeForVacuumCleanerAndMopAndPrint()+bedRoom.timeForVacuumCleanerAndMopAndPrint()+defaultRoom.timeForVacuumCleanerAndMopAndPrint();
        System.out.println("This time for all rooms "+time);

    }
}
