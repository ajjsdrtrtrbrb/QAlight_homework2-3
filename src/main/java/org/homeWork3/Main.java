package org.homeWork3;

public class Main {
    public static void main(String[] args) {
        Calculator calculatorMnognyk2=new Calculator();
        Calculator calculatorMnognyk5=new Calculator(5);
        Calculator calculatorMnognyk1=new Calculator(1);

        // ==== Для множника 2 ====
        int result1=calculatorMnognyk2.sum(3,5);
        double result2=calculatorMnognyk2.subtraction(20.5,5);
        double result3=calculatorMnognyk2.multiplication(2,3);
        double result4=calculatorMnognyk2.division(30,3);

        // ==== Для множника 5 ====
        int result5 = calculatorMnognyk5.sum(3, 5); // (3+5)*5 = 40
        double result6 = calculatorMnognyk5.subtraction(20.0, 5); // (20-5)*5 = 75.0
        double result7 = calculatorMnognyk5.multiplication(2, 3); // (2*3)*5 = 30.0
        double result8 = calculatorMnognyk5.division(30, 3); // (30/3)*5 = 50.0
        String result9 = calculatorMnognyk5.sum("_Test", "_row");

        // ==== Для множника 1 ====
        int result10 = calculatorMnognyk1.sum(3, 5); // (3+5)*1 = 8
        String result11 = calculatorMnognyk1.sum("_Test", "_row"); // "_Test_row"


        // ==== Вывод всех результатов ====
        PrintToConsole.printResult("(3 + 5) * 2", result1);
        PrintToConsole.printResult("(20.0 - 5) * 2", result2);
        PrintToConsole.printResult("(2 * 3) * 2", result3);
        PrintToConsole.printResult("(30 / 3) * 2", result4);

        PrintToConsole.printResult("(3 + 5) * 5", result5);
        PrintToConsole.printResult("(20.0 - 5) * 5", result6);
        PrintToConsole.printResult("(2 * 3) * 5", result7);
        PrintToConsole.printResult("(30 / 3) * 5", result8);
        PrintToConsole.printResult("\"_Test\" + \"_row\" повторено 5 раз", result9);

        PrintToConsole.printResult("(3 + 5) * 1", result10);
        PrintToConsole.printResult("\"_Test\" + \"_row\" повторено 1 раз", result11);

        // ==== Общая сумма числовых результатов ====
        double total = result1 + result2 + result3 + result4 + result5 + result6 + result7 + result8 + result10;
        System.out.println("Загальний результат числових дій: " + total);

    }
}
