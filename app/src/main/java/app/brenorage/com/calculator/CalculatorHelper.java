package app.brenorage.com.calculator;


import java.util.Date;

public class CalculatorHelper {

    public void calculatorHelper() {
    }

    public double exp(String exponent, String base) {
        Double newBase = Double.valueOf(base);
        Double newExponent = Double.valueOf(exponent);

        return Math.pow(newExponent, newBase);
    }
}
