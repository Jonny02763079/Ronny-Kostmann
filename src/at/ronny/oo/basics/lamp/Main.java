package at.ronny.oo.basics.lamp;

public class Main {
    public static void main(String[] args) {
        GlowElements g1 = new GlowElements("Avatar", "Blue", 10, GlowElements.STATUS.On);
        GlowElements g2 = new GlowElements("Anikan", "Blue", 12, GlowElements.STATUS.On);
        GlowElements g3 = new GlowElements("Kenobi", "Blue", 14, GlowElements.STATUS.On);
        Lamp l1 = new Lamp();
        l1.addGlowElements(g1);
        l1.addGlowElements(g2);
        l1.addGlowElements(g3);
        g1.turnOn();
        g1.turnOn();
        g1.turnOff();
        g1.turnOn();
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();
        System.out.println(l1.getGlowElementslist());
    }


}
