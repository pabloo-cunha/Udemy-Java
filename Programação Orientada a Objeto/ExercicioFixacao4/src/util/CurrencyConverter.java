package util;

public class CurrencyConverter {
    public static final double TAX = 1.06;

    public static double realPaid(double value, double dollar){

        return (value*dollar)*TAX;

    }



}
