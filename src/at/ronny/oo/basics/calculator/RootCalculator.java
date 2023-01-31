package at.ronny.oo.basics.calculator;

public class RootCalculator extends Calculator{

    public double root (double num, double numberOfRoot){
        double result = Math.pow(num, 1 / numberOfRoot);
        return result;
    };

    public RootCalculator() {
    }
}
