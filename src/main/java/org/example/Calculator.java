package org.example;

public class Calculator {
    public double add (double a, double b) {
        return a+b;
    }

    public double minus (double a, double b){
        return a-b;
    }

    public double multiple (double a, double b) {
        if (a > Double.MAX_VALUE / 2 || b > Double.MAX_VALUE / 2){
            throw new RuntimeException("Invalid number");
        }
        return a*b;
    }

    public double divide (double a, double b){
        return a/b;
    }

    public double slowMethod (double a, double b){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a+b;
    }
}
