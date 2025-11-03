package org.homework2;

public class CalculatingTimeForGarageAndKitchen {

    public static void main(String[] args) {

        double timeForVacuum = 1.5;
        double timeForMop = 3.0;
        double timeForKarcher = 0.5;
        double timeForDust = 1.0;
        double timeForWindow = 5.0;


        printLikeHeader("Start to work with Room1 - Garage");

        String room1Name = "Garage";
        double garageWidth = 3.5;
        double garageLength = 6.0;
        double gateWidth = 1.8;
        double gateHeight = 3.3;
        int windowsGarage = 1;


        double garageArea = calculateAreaOfRoom(garageWidth, garageLength);
        double gateArea = calculateAreaOfRoom(gateWidth, gateHeight) * 2;


        double timeGate = gateArea * timeForKarcher;
        double timeFloor = garageArea * (timeForMop / 2);
        double timeWindowsGarage = windowsGarage * timeForWindow;


        System.out.println(String.format("For gate with area %.1f square meters we need %.1f minutes",
                roundResult(gateArea), roundResult(timeGate)));

        System.out.println(String.format("For floor with area %.1f square meters we need %.1f minutes",
                roundResult(garageArea), roundResult(timeFloor)));

        System.out.println(String.format("Time for %d window is %.1f minutes",
                windowsGarage, roundResult(timeWindowsGarage)));

        double totalTimeGarage = timeGate + timeFloor + timeWindowsGarage;
        printLikeTotalTime(String.format("For cleaning %s is", room1Name), roundResult(totalTimeGarage));

        printLikeHeader("Finish work with ROOM 1 - Garage");



        printLikeHeader("Start to work with Room2 - Kitchen");

        String room2Name = "Kitchen";
        double kitchenWidth = 2.5;
        double kitchenLength = 3.5;
        int windowsKitchen = 2;
        int furnitureKitchen = 14;
        int dishesKitchen = 8;


        double kitchenArea = calculateAreaOfRoom(kitchenWidth, kitchenLength);


        double timeKitchenFloor = kitchenArea * timeForMop;
        double timeKitchenWindows = windowsKitchen * timeForWindow;
        double timeFurniture = furnitureKitchen * timeForDust;


        double timeOneDish = (timeForMop + timeForWindow) / 2;
        double timeAllDishes = timeOneDish * dishesKitchen;


        System.out.println(String.format("For floor with area %.1f square meters we need %.1f minutes",
                roundResult(kitchenArea), roundResult(timeKitchenFloor)));

        System.out.println(String.format("Time for %d windows is %.1f minutes",
                windowsKitchen, roundResult(timeKitchenWindows)));

        System.out.println(String.format("Time for %d pieces of furniture is %.1f minutes",
                furnitureKitchen, roundResult(timeFurniture)));

        System.out.println(String.format("For %d dishes we need %.1f minutes",
                dishesKitchen, roundResult(timeAllDishes)));

        double totalTimeKitchen = timeKitchenFloor + timeKitchenWindows + timeFurniture + timeAllDishes;
        printLikeTotalTime(String.format("For cleaning %s is", room2Name), roundResult(totalTimeKitchen));

        printLikeHeader("Finish work with ROOM 2 - Kitchen");



        double totalTime = totalTimeGarage + totalTimeKitchen;

        printLikeTotalTime(
                String.format("Total time for %s with area %.1f and %s with area %.1f is",
                        room1Name, roundResult(garageArea), room2Name, roundResult(kitchenArea)),
                roundResult(totalTime)
        );
    }


    private static double calculateAreaOfRoom(double width, double length) {
        return width * length;
    }

    private static void printLikeHeader(String text) {
        String symbols = "-".repeat(10);
        System.out.println(symbols + " " + text + " " + symbols);
    }

    private static void printLikeTotalTime(String text, double result) {
        System.out.println(String.format("!!TOTAL_TIME!! %s %.1f minutes", text, result));
    }

    private static double roundResult(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}

