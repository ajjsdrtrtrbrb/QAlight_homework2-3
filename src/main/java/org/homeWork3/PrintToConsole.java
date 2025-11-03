package org.homeWork3;

public class PrintToConsole {
    private static final String message = "Результат виконання дії: ";

    public static void printResult(String formula, int result) {
        System.out.println(message + formula + " = " + result);
    }

    public static void printResult(String formula, double result) {
        System.out.println(message + formula + " = " + result);
    }

    public static void printResult(String formula, String result) {
        System.out.println(message + formula + " = " + result);
    }

}
