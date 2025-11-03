package org.example;

public class CalculatingTimeForCleaningRoom_example {
    /**
     * Goals:
     * - Learn how to create a class
     * - Learn how to create a method
     * - Learn how to call a method
     * - Learn how to pass parameters to a method
     * - Try different types of variables
     * - Try different types of operators
     * - Try concatenation of strings
     * - Try String.format("some text %s", variable)
     * - Try 'System.out.print'
     * - Try different types of comments
     * - Work on one class
     */
    /**
     * Advantages:
     * - Easy to use
     * - Easy to understand
     * Disadvantages:
     * - Not easy to support
     * - Not easy to extend
     * - Not easy to read
     */
    /**
     * Task1:
     * 1.1 Calculate time for cleaning one room 'Living room' 3.75x4
     * (2 pieces of furniture and 1 window)
     *
     * Assumptions:
     * for 1 square meter of room we need 1.5 minute to clean it by vacuum cleaner
     * for 1 square meter of room we need 3 minute to clean it by mop
     * for wipe the dust on one piece of furniture we need 1 minute
     * for clean the window we need 300 000 milli sec (5 minutes)
     */
    public static void main(String[] args) {
        // General variables
        float timeForVacuumCleanerDefault = 1.5f;
        byte timeForMopDefault = 3; // can be byte, short, int, long
        short timeForWipeTheDustDefault = 1;
        int timeForWindowsDefaultMilliSec = 300000;

        // Calculate time for cleaning one room 'Living room' 3.75x4 (2 pieces of furniture and 1 window)
        String nameOfRoom_1 = "Living room";
        double widthOfRoom_1 = 3.75;
        double lengthOfRoom_1 = 4.2; //4.0

        int numberOfFurnitureRoom_1 = 2;
        int numberOfWindowsRoom_1 = 1;

        String longNameOfRoom_1 = nameOfRoom_1 + " " + widthOfRoom_1 + "x" + lengthOfRoom_1
                + " ("+numberOfFurnitureRoom_1 +" pieces of furniture and "+numberOfWindowsRoom_1+" window)";

        System.out.println(longNameOfRoom_1);

        String longNameOfRoom_1_with_5_params =
                String.format("%s %sx%s (%s pieces of furniture and %s window)"
                        , nameOfRoom_1, widthOfRoom_1, lengthOfRoom_1
                        , numberOfFurnitureRoom_1, numberOfWindowsRoom_1);
        System.out.println(longNameOfRoom_1_with_5_params);

//        System.out.println("------ Calculation of time for cleaning ------");
        printTextLikeHeader("Calculation of time for cleaning") ;
        //Calculate time for cleaning room 'Living room' 3.75x4 (2 pieces of furniture and 1 window)
        double timeForVacuumCleanerAndMop_Room_1 = (timeForVacuumCleanerDefault + timeForMopDefault)
                * widthOfRoom_1 * lengthOfRoom_1;
        System.out.println("timeForVacuumCleanerAndMop_Room_1 = " + timeForVacuumCleanerAndMop_Room_1);

        double timeForWipeTheDust_Room_1 =
                timeForWipeTheDustDefault * numberOfFurnitureRoom_1;
        System.out.println("timeForWipeTheDust_Room_1 = " + timeForWipeTheDust_Room_1);

        double timeForCleaningWindows_Room_1 =
                getMinutesFromMilliSec(timeForWindowsDefaultMilliSec) * numberOfWindowsRoom_1;
        System.out.println("timeForCleaningWindows_Room_1 = " + timeForCleaningWindows_Room_1);

        double totalTime_Room_1 = timeForVacuumCleanerAndMop_Room_1
                + timeForWipeTheDust_Room_1 + timeForCleaningWindows_Room_1;


        System.out.println("totalTime_Room_1 = " + totalTime_Room_1);

        //DRY - Don't Repeat Yourself

//        System.out.println("------ End of calculation ------");
        printTextLikeHeader("End of calculation") ;
        System.out.println("end of program");

    }

    private static void printTextLikeHeader(String textForFormat) {
         String symbols = "*".repeat(6);
            String spaces = " ".repeat(2);
            System.out.println(symbols + spaces + textForFormat + spaces + symbols);
    }

    private static double getMinutesFromMilliSec(int milliSec) {
        return milliSec / 60000.0;
    }

}

