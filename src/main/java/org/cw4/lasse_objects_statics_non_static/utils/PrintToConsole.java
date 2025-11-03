package org.cw4.lasse_objects_statics_non_static.utils;

public class PrintToConsole {
    /**
     * Print text with "*"
     * example **text**
     *
     * @param text
     */
    public static void printToConsoleWithFormat(String text) {
        String symbols = "*".repeat(10);
        System.out.println(symbols + text + symbols);
    }

    /**
     * total value → ******total value = [total value]*******
     *
     * @param totalValue
     */
    public static void printTotalValueLikeHeader(String totalValue) {
        printToConsoleWithFormat(" TOTAL VALUE = " + totalValue);
    }
}
