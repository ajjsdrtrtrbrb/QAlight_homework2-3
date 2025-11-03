package org.homeWork3;

public class Calculator {
    private int mnognyk;

    public Calculator() {
        this.mnognyk = 2;
    }

    public Calculator(int mnognyk) {
        this.mnognyk = mnognyk;
    }

    public int sum(int a, int b) {
        return (a + b) * mnognyk;
    }

    public double subtraction(double a, int b) {
        return (a - b) * mnognyk;
    }

    public double multiplication(int a, int b) {
        return (a * b) * mnognyk;
    }

    public double division(int a, int b) {
        return ((double) a / b) * mnognyk;
    }
    public String sum(String a, String b){
        return (a+b).repeat(mnognyk);
    }
}
