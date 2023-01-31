package at.ronny.oo.basics.calculator;

public class Main {
    public static void main(String[] args) {

        RootCalculator r1 = new RootCalculator();
        System.out.println(r1.root(343, 3));
        System.out.println(r1.add(485,500));

        SinusCalculator s1 = new SinusCalculator();
        System.out.println(s1.cosinus(180));
        System.out.println(s1.sinus(180));
        System.out.println(s1.divide(500, 800));


    }
}
